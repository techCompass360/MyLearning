package com.confluent.setup;
//https://github.com/CloudKarafka/springboot-kafka-example/blob/master/src/main/java/sample/kafka/Producer.java

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication1 {
	
	public static ApplicationContext ctx = null;

	public static void main(String[] args) {
		ctx=SpringApplication.run(DemoApplication1.class, args);
		Producer c= (Producer) ctx.getBean("producer");
		///c.send("Hello world 2");
		
		
	}

}

