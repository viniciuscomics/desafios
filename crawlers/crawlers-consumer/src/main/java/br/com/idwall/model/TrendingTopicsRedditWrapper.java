package br.com.idwall.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrendingTopicsRedditWrapper implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, List<TrendingTopicsReddit>> mapTopics = new HashMap<>();

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder();
		if (this.getMapTopics() != null && this.getMapTopics().size() > 0) {

			this.getMapTopics().entrySet().stream().forEach(e -> {

				str.append("SubReddit: " + e.getKey()).append("\n");

				e.getValue().forEach(x -> {
					str.append("-----------------------------------------------\n");
					str.append("\n");
					str.append("Titulo: " + x.getTituloThread()).append("\n");
					str.append("    Pontuacao: " + x.getPontuacao()).append("\n");
					str.append("    Link Noticia: " + x.getLinkThread()).append("\n");
					str.append("    Link Comentarios: " + x.getLinkComentario()).append("\n");
					str.append("\n");
					str.append("-----------------------------------------------").append("\n");

				});

			});			

			return str.toString();
		}

		return "";
	}

}
