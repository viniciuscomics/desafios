package br.com.idwall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.idwall.config.ConfigTelegram;
import br.com.idwall.exception.InputInvalidException;
import br.com.idwall.exception.RequestTelegramInvalid;
import br.com.idwall.model.TelegramApiRequest;
import br.com.idwall.model.TrendingTopicsRedditWrapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ApiTelegram {

	private ConfigTelegram configTelegram;

	private final int MAX_SIZE_TEXT = 4096;

	@Autowired
	public ApiTelegram(ConfigTelegram configTelegram) {
		this.configTelegram = configTelegram;
	}

	public TelegramApiRequest sendMessageChannel(TrendingTopicsRedditWrapper topics)
			throws InputInvalidException, RequestTelegramInvalid {

		TelegramApiRequest resp = null;
		
		for(String text : getTextTopics(topics)) {
			validar(text);			
			resp = sendMessage(text);
		}
		
		return resp;

	}

	private TelegramApiRequest sendMessage(String text) throws RequestTelegramInvalid {
		ResponseEntity<TelegramApiRequest> response = new RestTemplate().postForEntity(getUrlTelegram(text), null,
				TelegramApiRequest.class);
		String msg = "";

		if (response.getStatusCodeValue() >= HttpStatus.BAD_REQUEST.value()) {
			msg = "Erro ao enviar mensagem.\nCod.Erro = " + response.getStatusCodeValue();
			log.error(msg);
			throw new RequestTelegramInvalid(msg);
		}

		if (response.hasBody()) {
			return response.getBody();
		}

		throw new RequestTelegramInvalid("Mensagem não enviada.");
	}

	private List<String> getTextTopics(TrendingTopicsRedditWrapper topics) {

		List<String> listText = new ArrayList<>();

		String str = topics.toString();

		do {

			if (str.length() > MAX_SIZE_TEXT) {
				listText.add(str.substring(0, MAX_SIZE_TEXT));
				str = str.substring(MAX_SIZE_TEXT);
			} else {
				listText.add(str);
				str = "";
			}

		} while (str.length() > MAX_SIZE_TEXT && str.length() > 0);

		return listText;
	}

	private void validar(String text) throws InputInvalidException {
		stringNotNull(text, "mensagem");
		stringNotNull(configTelegram.getChatId(), "chat_id");
		stringNotNull(configTelegram.getToken(), "token");
		stringNotNull(configTelegram.getUrlApi(), "url api");
	}

	private void stringNotNull(String str, String nameParam) throws InputInvalidException {
		if (str == null || str.isEmpty()) {
			throw new InputInvalidException("O " + nameParam + " veio vazio.");
		}
	}

	private String getUrlTelegram(String text) {		
		
		StringBuilder url = new StringBuilder(configTelegram.getUrlApi());
		url.append(configTelegram.getToken()).append("/").append("sendMessage?").append("chat_id=")
				.append(configTelegram.getChatId()).append("&text=").append(text.trim());

		return url.toString();
	}

}
