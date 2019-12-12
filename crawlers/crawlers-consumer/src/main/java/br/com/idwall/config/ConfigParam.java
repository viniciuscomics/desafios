package br.com.idwall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("reddit")
@Getter
@Setter
public class ConfigParam {

	private String urlApi;
}
