package com.cris;

public class Singleton {

	protected String value;
	private static Singleton instance;
	
	public Singleton(String value) {
		
		this.value = value;
	}
	
	public static Singleton getInstance(String value) {
		
		if(instance == null) {
			instance = new Singleton(value);
		}
		
		return instance;
	}
	
	
}
