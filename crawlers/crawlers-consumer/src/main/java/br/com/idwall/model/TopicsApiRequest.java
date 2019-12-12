package br.com.idwall.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopicsApiRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> listLink;
	
	public TopicsApiRequest(List<String> listLink) {
		this.listLink = listLink;
	}

}
