package br.com.idwall.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.idwall.config.ConfigParam;
import br.com.idwall.exception.InputInvalidException;
import br.com.idwall.exception.RequestRedditInvalid;
import br.com.idwall.exception.SearchNotFoundException;
import br.com.idwall.model.TrendingTopicsRedditWrapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ApiIdWallReddit {

	private ConfigParam configPram;	

	@Autowired
	public ApiIdWallReddit(ConfigParam configParam) {
		this.configPram = configParam;
	}

	public TrendingTopicsRedditWrapper callApiTopics(String param)
			throws InputInvalidException, RequestRedditInvalid, SearchNotFoundException {

		validate(param);		

		log.info("Chamando a api trending topics.");
		
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<List<String>> entity = new HttpEntity<>(Arrays.asList(param.split(";")), headers);

		ResponseEntity<TrendingTopicsRedditWrapper> response = new RestTemplate().postForEntity(configPram.getUrlApi(),
				entity, TrendingTopicsRedditWrapper.class);

		log.info("Retornando resposta");

		if (response.getStatusCodeValue() >= HttpStatus.BAD_REQUEST.value()) {
			String msg = "Erro ao buscar topicos.\nCod.Erro = " + response.getStatusCodeValue();
			log.error(msg);
			throw new RequestRedditInvalid(msg);
		}

		if (response.hasBody()) {
			return response.getBody();
		}

		String msg = "A busca não encontrou resultado.";
		log.info(msg);
		throw new SearchNotFoundException(msg);

	}	

	private void validate(String param) throws InputInvalidException {
		if (param == null || param.isEmpty()) {
			String msg = "Parametro de entrada inválido. Informe um link valido para pesquisa.";
			log.error(msg);
			throw new InputInvalidException(msg);
		}
	}

}
