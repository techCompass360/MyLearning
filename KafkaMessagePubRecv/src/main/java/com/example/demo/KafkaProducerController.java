package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {
	
	@Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
	private static final String TOPIC = "Learning";
	
	 @GetMapping("/publish/{name}")
	    public String post(@PathVariable("name") final String name) {
		 System.out.println("*********PUBLISHING TO REMOTE MACHINE*******");

	        kafkaTemplate.send(TOPIC, new User(name, "Technology", 12000L));

	        return "Published successfully";
	    }
	    

}
