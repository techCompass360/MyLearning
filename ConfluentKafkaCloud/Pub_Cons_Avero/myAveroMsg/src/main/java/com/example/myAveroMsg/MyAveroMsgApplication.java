package com.example.myAveroMsg;
//https://www.confluent.io/blog/schema-registry-avro-in-spring-boot-application-tutorial/
//https://dzone.com/articles/kafka-avro-serialization-and-the-schema-registry
//https://itnext.io/howto-produce-avro-messages-to-kafka-ec0b770e1f54

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAveroMsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAveroMsgApplication.class, args);
	}

}
