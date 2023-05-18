package com.cris;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration

public class Config {
	
	@Bean
	public Parrot parrot() {
	Parrot p = new Parrot();
	p.setName("Lorenzo");
	return p;
	}
	
	@Bean
	public Person person(){
		Person p = new Person();
		p.setName("Carlos");
		p.setParrot(parrot());
		return p;
				
	}
	
}
