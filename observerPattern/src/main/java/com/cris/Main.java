package com.cris;

public class Main {

	public static void main(String[] args) {
		
		Product samsung = new Product("Samsung LED TV","TV","332","InStock");
		
		Customer a = new Customer("Juan","Compra");
		Customer b = new Customer("Pepe", "Ver");
		
		samsung.addObserver(a);
		samsung.addObserver(b);
		samsung.notifyObservers();
		
		
	}

}
