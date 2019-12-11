package br.com.idwall.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ISearchReddit {

	public ResponseEntity<?> searchTopTopicsReddit(List<String> params);
}
