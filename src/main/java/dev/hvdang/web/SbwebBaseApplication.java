package dev.hvdang.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Log4j2
@SpringBootApplication
public class SbwebBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbwebBaseApplication.class, args);
		log.info("App available at: localhost:8090/hvdangApp/swagger-ui/");
		log.info("App available at: localhost:8090/hvdangApp/web/demo/");
		log.info("App available at: localhost:8090/hvdangApp/h2-console");
	}

}
