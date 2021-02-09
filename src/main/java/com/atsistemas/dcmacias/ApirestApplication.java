package com.atsistemas.dcmacias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication	
@EnableJpaRepositories("com.atsistemas.dcmacias.repositories")
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

	 @EventListener(ApplicationReadyEvent.class)
	   public void populateAfterStartup() {
	//
	  }
}
