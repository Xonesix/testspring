package com.testwebsite.testwebsite;
import com.testwebsite.testwebsite.run.Location;
import com.testwebsite.testwebsite.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("gdf Changed");
	}

	@Bean
	CommandLineRunner runner()
	{
		return args -> {
			Run run = new Run(1,
					"First Run",
					LocalDateTime.now(),
					LocalDateTime.now().plus(1, ChronoUnit.HOURS),
					24, Location.OUTDOOR);
			log.info(run.toString());
		};
	}

}
