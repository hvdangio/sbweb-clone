
package dev.hvdang.web;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;


@Log4j2
@SpringBootTest
class SbwebBaseApplicationTests
{

	public static void main(String[] args) {
		SpringApplication.run(SbwebBaseApplication.class, args);
		log.info("App available at: localhost:8090/hvdangApp/rest/demo/employees");
		log.info("App available at: localhost:8090/hvdangApp/h2-console");
	}

	@Test
	void contextLoads() {
	}

}
