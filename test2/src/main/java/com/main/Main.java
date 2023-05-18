package com.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	List<Curso> cursos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();
		m.cargarObjetos();

		System.out.println("\n-----Obtener la cantidad de cursos con una duración mayor a 5 horas.------\n");
		System.out.println(m.ej1());
		System.out.println("\n-----Obtener la cantidad de cursos con una duración menor a 2 horas.-------\n");
		System.out.println(m.ej2());
		System.out.println(
				"\n-----Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.-------\n");

		List<String> ej3res = m.ej3();
		ej3res.forEach(System.out::println);

		System.out.println("\n----Mostrar en consola el título de los 3 cursos con mayor duración.----\n");
		// List<String> ej4res = m.ej4();
		m.ej4();
		// ej4res.forEach(System.out::println);
		System.out.println("\n------Obtener el curso con mayor duración------\n");
		m.ej5();
		System.out.println("\n------Obtener la cantidad de cursos con una duración menor a 2 horas------\n");
		m.ej6();
		//
		System.out.println("\n------Mostrar en consola la duración total de todos los cursos. Mostrar en consola------\n");
		m.ej7();

		System.out.println("\n--------todos aquellos libros que superen el promedio de duracion-------\n");
		m.ej8();

		System.out.println(
				"\nMostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500\n");
		m.ej9();
		System.out.println("\n--------Cantidad de alumnos inscritos menor a 500--------\n");
		m.ej10();
		System.out.println("\n--------Mostrar en consola la duración total de todos los cursos.-------- \n");
		m.ej11();

	}

	// Obtener la cantidad de cursos con una duración mayor a 5 horas.
	public int ej1() {
		return (int) cursos.stream().filter(f -> f.getDuracion() > 5).count();
	}

	// Obtener la cantidad de cursos con una duración menor a 2 horas.

	public int ej2() {
		return (int) cursos.stream().filter(f -> f.getDuracion() < 2).count();
	}

	// Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a
	// 50.

	public List<String> ej3() {
		return cursos.stream().filter(f -> f.getVideos() > 50).map(f -> f.getTitulo()).collect(Collectors.toList());
	}

	// Mostrar en consola el título de los 3 cursos con mayor duración.
	/*
	 * public List<String> ej4() { return cursos.stream()
	 * .sorted(Comparator.comparing(Curso::getDuracion).reversed()) .limit(3)
	 * .map(Curso::getTitulo) .collect(Collectors.toList()); }
	 */
	public void ej4() {

		cursos.stream().sorted(Comparator.comparing(Curso::getDuracion)).skip(cursos.size() - 3).map(Curso::getTitulo)
				.collect(Collectors.toList()).forEach(System.out::println);
		;
	}

	// Obtener el curso con mayor duración

	public void ej5() {
		cursos.stream().sorted(Comparator.comparing(Curso::getDuracion)).limit(1).map(Curso::getTitulo)
				.collect(Collectors.toList()).forEach(System.out::println); // tambien funciona skip(cursos.size() - 1)

	}

	// Obtener la cantidad de cursos con una duración menor a 2 horas

	public void ej6() {

		cursos.stream().filter(f -> f.getDuracion() < 2).collect(Collectors.toList()).forEach(System.out::println);
		;
	}

	// Mostrar en consola la duración total de todos los cursos. Mostrar en consola
	public void ej7() {
		System.out.println(cursos.stream().mapToInt(Curso::getDuracion).sum());
	}

	// todos aquellos libros que superen el promedio de duracion
	public void ej8() {
		int avg = (int) cursos.stream().mapToInt(Curso::getDuracion).average().orElse(0);
		cursos.stream().filter(curso -> curso.getDuracion() > avg).collect(Collectors.toList())
				.forEach(System.out::println);
		;
	}

	// Mostrar en consola la duración de todos aquellos cursos que tengan una
	// cantidad de alumnos inscritos menor a 500
	public void ej9() {
		cursos.stream().filter(f -> f.getAlumnos() < 500).collect(Collectors.toList()).forEach(System.out::println);
	}

	// Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a
	// 50
	public void ej10() {
		cursos.stream().filter(f -> f.getVideos() > 50).collect(Collectors.toList()).forEach(System.out::println);
	}

	// Mostrar en consola la duración total de todos los cursos.
	public void ej11() {
		System.out.println(cursos.stream().mapToInt(Curso::getDuracion).sum());
	}


	public void cargarObjetos() {
		cursos = new ArrayList<>();
		cursos.add(new Curso("Cursos profesional de Java", 6, 50, 200));
		cursos.add(new Curso("Cursos profesional de Python", 8, 60, 800));
		cursos.add(new Curso("Cursos profesional de DB", 4, 70, 700));
		cursos.add(new Curso("Cursos profesional de Android", 7, 10, 400));
		cursos.add(new Curso("Cursos profesional de Escritura", 1, 10, 300));
	}
}
