package com.cris;

public class Main {

	public static void main(String[] args) {
		
		//SINGLETON PARA OBJETOS MUY CAROS PARA QUE NO SE INSTANCIEN MAS DE UNA VEZ
		Singleton s1 = Singleton.getInstance("Java");
		Singleton s2 = Singleton.getInstance("Phyton");
		
		System.out.println(s1.value);
		System.out.println(s2.value);
	}

}
