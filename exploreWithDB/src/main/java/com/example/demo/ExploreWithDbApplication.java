package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//https://medium.com/@wkrzywiec/how-to-publish-a-spring-boot-app-with-a-database-on-the-google-cloud-platform-614b88613ce3
//https://www.baeldung.com/spring-boot-google-app-engine

@SpringBootApplication
@EntityScan(basePackages = {"com.test.db"} )
@EnableJpaRepositories(basePackages = {"com.test.db"})
public class ExploreWithDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreWithDbApplication.class, args);
	}

}
