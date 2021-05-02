package com.example.myAveroMsg;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import io.confluent.developer.User;

@Configuration
public class Consumer {
	
	
	  @Value("${topic.name}") 
	  private String topicName;
	 

	  @KafkaListener(topics = "${topic.name}", groupId = "group_id")   
	  public void consume(ConsumerRecord<String, User> record) {
		  System.out.println("****Message received****");
	    System.out.println(record.value());
	    User u = record.value();
	    System.out.println("Name="+ u.getName());
	    System.out.println("Age="+ u.getAge());
	  }

}
