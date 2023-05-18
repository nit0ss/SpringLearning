package com.cris;

public class Customer implements Observer {

	private String name;
	private String why;
	
	
	public Customer(String name, String why) {
		this.name = name;
		this.why = why;
	}

	public void update(String availability) {
		System.out.println(name +" notificado de: " + availability);
	}

}
