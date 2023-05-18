package com.cris;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private List<Observer> customers;
	private String productName;
	private String productType;
	private String productPrice;
	private String availability;
	
	
	public Product(String productName, String productType, String productPrice,
			String availability) {
		
		customers = new ArrayList<Observer>();
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		this.availability = availability;
	}
	
	
	
	
	public void addObserver(Observer observer) {
		customers.add(observer);

	}

	public void removeObserver(Observer observer) {
		customers.remove(observer);
		notifyObservers();
	}

	

	public void setAvailability(String availability) {
		this.availability = availability;
	}




	public void notifyObservers() {
		for(Observer customers: customers){
			customers.update(this.availability);
		}
	}




}
