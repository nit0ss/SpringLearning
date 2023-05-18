package com.cris;

public class Person {
	private String name;
	private Parrot direction;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Parrot getDirection() {
		return direction;
	}

	public void setParrot(Parrot direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", parrot=" + direction + "]";
	}

}
