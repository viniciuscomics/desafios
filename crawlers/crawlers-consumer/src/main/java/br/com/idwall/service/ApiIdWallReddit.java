package br.com.idwall.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.idwall.config.ConfigParam;
import br.com.idwall.exception.InputInvalidException;
import br.com.idwall.exception.RequestRedditInvalid;
import br.com.idwall.exception.SearchNotFoundException;
import br.com.idwall.model.TopicsApiRequest;
import br.com.idwall.model.TrendingTopicsRedditWrapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ApiIdWallReddit {

	private ConfigParam configPram;

	private final int COD_ERRO = 400;

	@Autowired
	public ApiIdWallReddit(ConfigParam configParam) {
		this.configPram = configParam;
	}

	public TrendingTopicsRedditWrapper callApiTopics(String param)
			throws InputInvalidException, RequestRedditInvalid, SearchNotFoundException {

		validate(param);

		String jsonParams = getJsonParam(param);

		log.info("Chamando a api trending topics.");
		
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<List<String>> entity = new HttpEntity<>(Arrays.asList(param.split(";")), headers);

		ResponseEntity<TrendingTopicsRedditWrapper> response = new RestTemplate().postForEntity(configPram.getUrlApi(),
				entity, TrendingTopicsRedditWrapper.class);

		log.info("Retornando resposta");

		if (response.getStatusCodeValue() >= COD_ERRO) {
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

	private String getJsonParam(String param) {

		ObjectMapper obj = new ObjectMapper();

		String json = "";
		try {
			json = obj.writeValueAsString(new TopicsApiRequest(Arrays.asList(param.split(";"))));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return json;
	}

	private void validate(String param) throws InputInvalidException {
		if (param == null || param.isEmpty()) {
			String msg = "Parametro de entrada inválido. Informe um link valido para pesquisa.";
			log.error(msg);
			throw new InputInvalidException(msg);
		}
	}

}
