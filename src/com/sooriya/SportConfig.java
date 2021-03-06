package com.sooriya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
// manually defining beans and injecting beans
@Bean
public FortuneService sadFortuneService() 
{
	return new SadFortuneService();
}
@Bean
public Coach baseballCoach()
{
	return new BaseballCoach(sadFortuneService());
	
}

}
