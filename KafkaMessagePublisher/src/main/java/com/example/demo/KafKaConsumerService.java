package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

 
@Service
public class KafKaConsumerService 
{
    private final Logger logger = 
            LoggerFactory.getLogger(KafKaConsumerService.class);
 
	/*
	 * @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId =
	 * AppConstants.GROUP_ID)
	 */
    @KafkaListener(topics = "test" )
    public void consume(String message) 
    {
        logger.info(String.format("Message recieved -> %s", message));
    }
}

