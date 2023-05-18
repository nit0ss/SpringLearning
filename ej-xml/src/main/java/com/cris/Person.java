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
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", parrot=" + direction + "]";
	}
	
}
