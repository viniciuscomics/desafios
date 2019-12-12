package br.com.idwall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties("telegram")
public class ConfigTelegram {

	private String token;
	private String urlApi;
	private String chatId;
}