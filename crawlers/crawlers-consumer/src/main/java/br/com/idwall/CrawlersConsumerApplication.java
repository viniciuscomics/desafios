package br.com.idwall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigurationProperties
@Slf4j
public class CrawlersConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrawlersConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Iniciando a aplicação...");
		
	}

}
