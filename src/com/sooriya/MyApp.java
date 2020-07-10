package com.sooriya;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new
    		 AnnotationConfigApplicationContext(SportConfig.class);
     BaseballCoach theCoach = context.getBean("baseballCoach",BaseballCoach.class);
     System.out.println(theCoach.getDailyWorkout());
     System.out.println(theCoach.getDailyFortune());
     System.out.println(theCoach.getEmail());
     System.out.println(theCoach.getName());
     context.close();
     
	}

}
