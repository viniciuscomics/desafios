package br.com.idwall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class CrawlersIdwallApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrawlersIdwallApplication.class, args);
	}

}
