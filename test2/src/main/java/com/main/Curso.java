package com.main;

public class Curso {
	private String titulo;
	private int duracion; // Expresada en horas
	private int videos; // cantidad de vídeos
	private int alumnos; // Cantidad de alumnos

	public Curso(String titulo, int duracion, int videos, int alumnos) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.videos = videos;
		this.alumnos = alumnos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getVideos() {
		return videos;
	}

	public void setVideos(int videos) {
		this.videos = videos;
	}

	public int getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}
	 @Override
	    public String toString() {
	        return "Curso{" +
	                "nombre='" + this.titulo + '\'' +
	                ", duracion=" + duracion +
	                ", videos=" + videos +
	                ", estudiantes=" + alumnos +
	                '}';
	    }
}
