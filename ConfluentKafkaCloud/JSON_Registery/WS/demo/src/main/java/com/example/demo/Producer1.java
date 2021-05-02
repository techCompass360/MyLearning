package com.example.demo;

import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;



@Component("producer")
public class Producer1 {
	
	//Producer<String, MyMessage> producer = new KafkaProducer<String, MyMessage>();
	
	@Value("${topic.name}")   
private String TOPIC;

private final KafkaTemplate<String, User> kafkaTemplate;

@Autowired
public Producer1(KafkaTemplate<String, User> kafkaTemplate) {   
  this.kafkaTemplate = kafkaTemplate;
}

void sendMessage(User user) throws InterruptedException, ExecutionException {
	ProducerFactory<String,User >pf=	  kafkaTemplate.getProducerFactory();
	ProducerRecord<String, User> record  = new ProducerRecord<String, User>(TOPIC, "123", user);
	
  this.kafkaTemplate.send(this.TOPIC, user.getMyField3(), user);  
 
}


}
