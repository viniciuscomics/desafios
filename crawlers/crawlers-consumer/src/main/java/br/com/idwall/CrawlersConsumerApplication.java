package br.com.idwall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.idwall.controller.ConsumerController;
import br.com.idwall.model.TelegramApiRequest;
import br.com.idwall.model.TrendingTopicsRedditWrapper;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigurationProperties
@Slf4j
public class CrawlersConsumerApplication implements CommandLineRunner {

	@Autowired
	private ConsumerController searchTopicsController;
	
	private final String CMD_BOT = "/NadaPraFazer";
	
	public static void main(String[] args) {
		SpringApplication.run(CrawlersConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Iniciando a aplicação...");
		
		try {
			
			if (args != null && args.length > 1) {
				
				if(args[1].equals(CMD_BOT)) {
					TelegramApiRequest telegram = searchTopicsController.sendMessage(args[2]);
					System.out.println("Mensagem Enviada: ");
					System.out.println("Channel: "+telegram.getResult().getChat().getTitle());
				}
				else {
					TrendingTopicsRedditWrapper topics = searchTopicsController.searchTopics(args);
					System.out.println(topics.toString());
				}
				
			}
			else {
				System.out.println("Nenhum parametro informado.");
			}
			
						
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			log.error(e.getMessage());
		}
		
	}

}
