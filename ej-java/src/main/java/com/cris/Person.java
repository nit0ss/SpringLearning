package com.cris;

public class Person {
	private String name;
	private Direction direction;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Direction getDireccion() {
		return direction;
	}
	public void setDirection(Direction direccion) {
		this.direction = direccion;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", direccion=" + direction + "]";
	}
	
	
	
}
