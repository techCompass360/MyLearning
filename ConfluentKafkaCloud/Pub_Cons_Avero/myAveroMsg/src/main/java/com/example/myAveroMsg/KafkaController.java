package com.example.myAveroMsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.confluent.developer.User;

@RestController
@RequestMapping(value = "/user")  
public class KafkaController {
	
	
	private final Producer producer;

	  @Autowired
	  KafkaController(Producer producer) {   
	    this.producer = producer;
	  }

	  @GetMapping(value = "/publish/{msg}")
	    public String  publish(@PathVariable("msg") String  msg) {
	    this.producer.sendMessage(new User(msg, 10));  
	    return "Hello 123" ;
	  }

}
