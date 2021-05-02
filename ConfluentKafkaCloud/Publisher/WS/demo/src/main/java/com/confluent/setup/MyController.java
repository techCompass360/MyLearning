package com.confluent.setup;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foos")
public class MyController {
	
	@Autowired
	public Producer producer ;
	
	 @GetMapping(value = "/publish/{msg}")
	    public String  publish(@PathVariable("msg") String  msg) {
		 
		 System.out.println(msg);
		 MyMessage m = new MyMessage();
		 m.setS(msg);
		 m.setI(new Random().nextInt(10));
		 producer.send(m);
	        return "*****Published*****";
	    }
	
	
	

}
