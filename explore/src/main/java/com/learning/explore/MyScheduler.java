package com.learning.explore;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
	
	@Scheduled(fixedDelay = 1000)
	public void myTask() {
		System.out.println("***HELLO WORLD:: LEARNING APP ENGINE****");
		
	}

}
