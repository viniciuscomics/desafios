package br.com.idwall.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrendingTopicsRedditWrapper implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, List<TrendingTopicsReddit>> mapTopics = new HashMap<>();

}
