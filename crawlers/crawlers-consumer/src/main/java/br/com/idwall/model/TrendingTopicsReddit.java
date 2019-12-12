package br.com.idwall.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrendingTopicsReddit implements Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long pontuacao;	
	private String tituloThread;
	private String linkComentario;
	private String linkThread;
	
}
