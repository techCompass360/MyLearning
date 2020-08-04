package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.test.db"} )
@EnableJpaRepositories(basePackages = {"com.test.db"})
public class ExploreWithDbForFlexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreWithDbForFlexApplication.class, args);
	}

}
