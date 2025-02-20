package br.com.idwall.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.idwall.service.ISearchReddit;

@RestController
@RequestMapping("/topics")
public class TrendingTopicsController {
	
	@Autowired
	private ISearchReddit searchReddit;

	@PostMapping
	public ResponseEntity<?> createTopics(@RequestBody List<String> params) {

		return searchReddit.searchTopTopicsReddit(params);
	}

}
