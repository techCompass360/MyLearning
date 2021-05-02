package com.example.demo;

import java.util.Random;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foos")
public class MyController {
	
	@Autowired
	public Producer1 producer ;
	
	 @GetMapping(value = "/publish/{msg}")
	    public String  publish(@PathVariable("msg") String  msg) {
		 
		 System.out.println(msg);
		 MyMessage m = new MyMessage();
		 User u = new User();
			/*
			 * u.setName(msg); u.setAge(new Random().nextInt(10));
			 */
		 
		 u.setMyField3(msg);
		 u.setMyField1(new Random().nextInt(10));
			
		 try {
			producer.sendMessage(u);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        return "*****Published*****";
	    }
	
	
	

}
