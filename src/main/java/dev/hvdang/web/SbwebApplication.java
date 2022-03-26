package dev.hvdang.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;


@Log4j2
public class SbwebApplication extends SbwebBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbwebApplication.class, args);
		log.info("App available at: localhost:8091/hvdangApp/web/clone/");
		log.info("App available at: localhost:8091/hvdangApp/h2-console");
	}

}
