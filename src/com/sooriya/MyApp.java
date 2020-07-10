package com.sooriya;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
	// creating spring container and loading configuration file
     AnnotationConfigApplicationContext context = new
    		 AnnotationConfigApplicationContext(SportConfig.class);
     // retrieving beans from container
     BaseballCoach theCoach = context.getBean("baseballCoach",BaseballCoach.class);
     // calling methods on bean
     System.out.println(theCoach.getDailyWorkout());
     System.out.println(theCoach.getDailyFortune());
     System.out.println(theCoach.getEmail());
     System.out.println(theCoach.getName());
     context.close();
     
	}

}
