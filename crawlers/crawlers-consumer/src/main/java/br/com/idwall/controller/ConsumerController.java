package br.com.idwall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.idwall.exception.InputInvalidException;
import br.com.idwall.exception.MessageNotSendException;
import br.com.idwall.exception.RequestRedditInvalid;
import br.com.idwall.exception.RequestTelegramInvalid;
import br.com.idwall.exception.SearchNotFoundException;
import br.com.idwall.model.TelegramApiRequest;
import br.com.idwall.model.TrendingTopicsRedditWrapper;
import br.com.idwall.service.ApiIdWallReddit;
import br.com.idwall.service.ApiTelegram;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ConsumerController {

	@Autowired
	private ApiIdWallReddit apiIdWallReddit;
	
	@Autowired 
	private ApiTelegram apiTelegram;

	public TrendingTopicsRedditWrapper searchTopics(String... param)
			throws InputInvalidException, RequestRedditInvalid, SearchNotFoundException {

		if (param != null && param.length > 1) {
			return apiIdWallReddit.callApiTopics(param[1]);
		}
		
		throw new InputInvalidException("Não foi informado nenhum parametro de entrada.");
	}
	
	public TelegramApiRequest sendMessage(String param) throws MessageNotSendException {		
		
		String msg = "";
		
		try {
			TrendingTopicsRedditWrapper topics = apiIdWallReddit.callApiTopics(param);
			
			return apiTelegram.sendMessageChannel(topics);
			
		} catch (InputInvalidException | RequestRedditInvalid |SearchNotFoundException  e) {
			msg = e.getMessage();
			log.error("Erro na busca dos topicos.", e);
		} catch (RequestTelegramInvalid e) {
			msg = e.getMessage();
			log.error("Erro no envio da mensagem para o telegram.", e);
		}
		
		throw new MessageNotSendException("Erro ao enviar mensagem.\n"+msg);
	}
}
