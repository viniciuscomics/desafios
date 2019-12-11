package br.com.idwall.engine.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.idwall.config.ConfigParamMotor;
import br.com.idwall.engine.IMotorReddit;
import br.com.idwall.model.TrendingTopicsReddit;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MotorReddit implements IMotorReddit {

	private Integer timeout;
	private String urlReddit;
	private Integer minPontos;
	private ConfigParamMotor config;

	@Autowired
	public MotorReddit(ConfigParamMotor config) {
		this.timeout = config.getTimeoutSecond();
		this.urlReddit = config.getDomain();
		this.minPontos = config.getMinPontos();
		this.config = config;
	}

	@Override
	public Map<String, List<TrendingTopicsReddit>> getTopThreadsReddit(List<String> links)
			throws MalformedURLException, IOException {

		Map<String, List<TrendingTopicsReddit>> mapTopics = new HashMap<>();

		for (String link : links) {

			log.info("Buscando dados referente a " + link);

			Document doc = getDocument(link);

			List<TrendingTopicsReddit> listTopics = new ArrayList<>();

			for (Element e : doc.select("div.thing").nextAll()) {

				String p = e.select("div.midcol.unvoted").select("div.score.unvoted").html();

				if (p != null && !p.isEmpty()) {

					try {

						Long pontos = Long.parseLong(p);

						if (pontos >= this.minPontos) {

							String linkComentario = e.select("div.entry.unvoted").select("div.top-matter")
									.select("ul.flat-list.buttons").select("li.first").first().getElementsByTag("a")
									.attr("href");

							boolean exists = listTopics.stream()
									.filter(ev -> ev.getLinkComentario().equals(linkComentario)).findAny()
									.orElse(null) != null;

							if (exists == false) {
								TrendingTopicsReddit topic = new TrendingTopicsReddit();
									
								topic.setPontuacao(pontos);
								
								Element x = e.select("div.entry.unvoted").select("div.top-matter").select("p.title")
										.select("a.title").first();

								topic.setTituloThread(x.getElementsByTag("a").html());

								String linkThread = x.getElementsByTag("a").attr("href");

								if (!linkThread.contains("http")) {
									linkThread = this.urlReddit.substring(0, this.urlReddit.length() - 1) + linkThread;
								}

								topic.setLinkThread(linkThread);

								topic.setLinkComentario(linkComentario);

								listTopics.add(topic);
							}

						}
					} catch (Exception ex) {
						// Posso ignorar esse exception, pois pode ser devido a tentar fazer parser de
						// lixo.
					}
				}

			}

			if (listTopics.size() > 0) {				
				listTopics.sort(Comparator.comparing(TrendingTopicsReddit::getPontuacao));				
				mapTopics.put(link, listTopics);
			}
		}
		return mapTopics;
	}

	private Document getDocument(String link) throws IOException {

		Document doc = null;

		if (this.config.isOffline() == false) {
			log.info("Busca do tipo online.");
			URL url = new URL(this.urlReddit + link);
			doc = Jsoup.parse(url, this.timeout * 1000);
		} else {
			log.info("Busca do tipo offline.");
			Scanner scan = null;
			try {
				scan = new Scanner(new File(config.getPathHtml()));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			String html = "";

			while (scan.hasNextLine()) {
				html += scan.nextLine() + "\n";
			}

			doc = Jsoup.parse(html);
		}

		return doc;
	}
}
