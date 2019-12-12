package br.com.idwall.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chat implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private float id;
	private String title;
	private String username;
	private String type;

}
