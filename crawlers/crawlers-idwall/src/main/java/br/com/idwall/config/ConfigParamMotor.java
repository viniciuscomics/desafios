package br.com.idwall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties("reddit")
public class ConfigParamMotor {	
	private String domain;
	private Integer timeoutSecond;
	private Integer minPontos;
	private boolean offline;
	private String pathHtml;
}
