package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.test.db.EmployeeRepository;

@Component
public class MyScheduler {
	@Autowired
	private  EmployeeRepository  empRepository ;
	
	@Scheduled(fixedDelay = 1000)
	public void myTask() {
		System.out.println("***HELLO WORLD:: LEARNING GKE ****");
		
		System.out.println("No. of Employees in DB::="+ empRepository.count());
		
	}

}
