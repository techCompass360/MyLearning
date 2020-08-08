package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//https://codelabs.developers.google.com/codelabs/cloud-springboot-kubernetes/#1




@SpringBootApplication
@EntityScan(basePackages = {"com.test.db"} )
@EnableJpaRepositories(basePackages = {"com.test.db"})
public class ExploreGkeWithDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreGkeWithDbApplication.class, args);
	}

}
