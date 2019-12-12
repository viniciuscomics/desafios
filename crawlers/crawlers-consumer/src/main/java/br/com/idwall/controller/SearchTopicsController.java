package br.com.idwall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.idwall.exception.InputInvalidException;
import br.com.idwall.exception.RequestRedditInvalid;
import br.com.idwall.exception.SearchNotFoundException;
import br.com.idwall.model.TrendingTopicsRedditWrapper;
import br.com.idwall.service.ApiIdWallReddit;

@Controller
public class SearchTopicsController {

	@Autowired
	private ApiIdWallReddit apiIdWallReddit;

	public TrendingTopicsRedditWrapper searchTopics(String... param)
			throws InputInvalidException, RequestRedditInvalid, SearchNotFoundException {

		if (param != null && param.length > 1) {
			return apiIdWallReddit.callApiTopics(param[1]);
		}
		
		throw new InputInvalidException("Não foi informado nenhum parametro de entrada.");
	}
}
