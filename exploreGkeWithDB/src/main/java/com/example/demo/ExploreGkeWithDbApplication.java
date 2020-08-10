package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.scheduling.annotation.EnableScheduling;

//https://codelabs.developers.google.com/codelabs/cloud-springboot-kubernetes/#1
//https://medium.com/@severomer86/spring-boot-on-google-gke-with-cloud-sql-257b030051c8
@SpringBootApplication
@EntityScan(basePackages = {"com.test.db"} )
@EnableJpaRepositories(basePackages = {"com.test.db"})
@EnableScheduling
public class ExploreGkeWithDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreGkeWithDbApplication.class, args);
	}

}
