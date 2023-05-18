package com.cris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:beans.xml")

public class Config {
	//config en el beans.xml
	@Autowired
	private Direction direction;
	//config en java
	@Bean
	public Person person() {
		Person p = new Person();
		p.setName("Joaquin");
		p.setDirection(direction);
		return p;

	}

}
