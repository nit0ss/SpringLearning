package com.cris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Direction direccion = context.getBean(Direction.class);
		Person person = context.getBean(Person.class);
		
		System.out.println(person.toString());
		
		((ConfigurableApplicationContext) context).close();
		
	}

}
