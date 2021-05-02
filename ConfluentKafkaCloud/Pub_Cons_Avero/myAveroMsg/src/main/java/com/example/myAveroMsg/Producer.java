package com.example.myAveroMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import io.confluent.developer.User;

@Configuration
public class Producer {
	
	@Value("${topic.name}")   
	  private String TOPIC;

	  private final KafkaTemplate<String, User> kafkaTemplate;

	  @Autowired
	  public Producer(KafkaTemplate<String, User> kafkaTemplate) {   
	    this.kafkaTemplate = kafkaTemplate;
	  }

	  void sendMessage(User user) {
	    this.kafkaTemplate.send(this.TOPIC, user.getName(), user);   
	    
	  }

}
