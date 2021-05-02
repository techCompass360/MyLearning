package com.confluent.setup;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component("producer")
public class Producer {
	
	 private final KafkaTemplate<String, String> kafkaTemplate;


	    @Value("${cloudkarafka.topic}")
	    private String topic;

	    Producer(KafkaTemplate<String, String> kafkaTemplate) {
	        this.kafkaTemplate = kafkaTemplate;
	    }
// MyMessage m
		/*
		 * public void send(String message) { this.kafkaTemplate.send(topic, message);
		 * System.out.println("Sent sample message [" + message + "] to " + topic); }
		 */
	    
	    public void send(MyMessage m) {
	    	String s = new Gson().toJson(m);
	        this.kafkaTemplate.send(topic, s);
	    	//this.kafkaTemplate.send(topic, "1", m);
	        System.out.println("Sent sample message [" + m + "] to " + topic);
	    }

}
