package com.cris;

public class Direction {
	private int postal;
	private String direction;
	private int numero;
	public int getPostal() {
		return postal;
	}
	public void setPostal(int postal) {
		this.postal = postal;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Direction [postal=" + postal + ", direction=" + direction + ", numero=" + numero + "]";
	}
	
	
}	
