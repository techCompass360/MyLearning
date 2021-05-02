package com.example.demo;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;



import org.springframework.kafka.support.KafkaHeaders;

@Component
public class Consumer {
	
	/*
	 * @KafkaListener(topics = "${cloudkarafka.topic}") public void
	 * processMessage(String message,
	 * 
	 * @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
	 * 
	 * @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topics,
	 * 
	 * @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
	 * System.out.printf("%s-%d[%d] \"%s\"\n", topics.get(0), partitions.get(0),
	 * offsets.get(0), message); }
	 */
	
		@KafkaListener(topics = "${topic.name}")
		public void processMessage(/* String message */ User u)
                                {
       // System.out.printf( message);
			System.out.println(u.getMyField3());
			System.out.println(u.getMyField1() );
        
       
    }

}
