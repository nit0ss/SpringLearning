package com.cris;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration

public class Config {

	@Bean
	public Direction direction() {
		Direction direction = new Direction();
		direction.setDirection("Leones");
		direction.setNumero(56);
		direction.setPostal(444);
		return direction;
	}

	@Bean
	public Person person() {
		Person p = new Person();
		p.setName("Carlos");
		p.setDirection(direction());
		return p;

	}

}
