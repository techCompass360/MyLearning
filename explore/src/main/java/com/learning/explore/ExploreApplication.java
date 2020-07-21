package com.learning.explore;
//https://dzone.com/articles/deploy-spring-boot-app-to-gcp-app-engine

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExploreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreApplication.class, args);
	}

}
