package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicConsumer {
	
	
	@KafkaListener(topics = "Learning")
	public void listen(String message) {
	    System.out.println("Received Message in group foo: " + message);
	}

}
