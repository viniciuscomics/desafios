package br.com.idwall.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.idwall.engine.IMotorReddit;
import br.com.idwall.model.TrendingTopicsReddit;
import br.com.idwall.model.TrendingTopicsRedditWrapper;
import br.com.idwall.service.ISearchReddit;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SearchReddit implements ISearchReddit {	

	@Autowired
	private IMotorReddit motorReddit;

	@Override
	public ResponseEntity<?> searchTopTopicsReddit(List<String> params) {
		Map<String, List<TrendingTopicsReddit>> mapTopics = null;

		try {
			mapTopics = motorReddit.getTopThreadsReddit(params);
			
			TrendingTopicsRedditWrapper wrapper = new TrendingTopicsRedditWrapper();
			wrapper.setMapTopics(mapTopics);

			return ResponseEntity.status(HttpStatus.OK).body(wrapper);
		} catch (IOException e) {
			log.error("Error ao buscar topicos.", e);
		}

		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(mapTopics);
	}

}
