package com.testj8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	List<Curso> cursos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();
		m.cargarObjetos();
		List<Curso> cursoLista = m.getCursosConMasDe10Videos();
		List<Curso> cursoLista1 = m.getCursosConMasDe5h();
		List<Curso> cursoLista2 = m.getCursosConMenos50VideosYMas300Alumnos();
		// cursoMuchosVideos.forEach(System.out::println);

		List<String> lista = Arrays.asList("Mitchum", "Delon", "Belmondo", "Affleck", "De Niro", "Al Pacino", "Daniel Craig", "Torrente", "Nuria Espert", "Wayne", "Darin", "Depardieu");
		
		System.out.println("-------- Empieza Por T ---------");
		lista.stream().filter(actor -> actor.startsWith("T")).collect(Collectors.toList()).forEach(System.out::println);;
		System.out.println("-------- Tiene U ---------");
		lista.stream().filter(actor -> actor.contains("u")).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("-------- Nombre compuesto ---------");
		List<String> actoresFiltrados = lista.stream().filter(actor -> {
                    String[] nombres = actor.split(" ");
                    return nombres.length > 1;
                })
                .sorted().collect(Collectors.toList());
		
		actoresFiltrados.forEach(System.out::println);


		
		
		// cursoMuchosVideos1.forEach(curso -> System.out.println("Duracion +5h =>" +
		// curso));
		System.out.println("---------------------------------");
		cursoLista2.forEach(curso -> System.out.println("Filtrado => " + curso));
		// cursoMuchosVideos1.forEach(System.out::println);
		System.out.println("---------------------------------");

		IntStream.range(0, cursoLista1.size()).boxed()
				.map(i -> "(Titulos +10) Encontrado!!: " + i + "-" + cursoLista.get(i)).forEach(System.out::println);
		System.out.println("---------------------------------");
		IntStream.range(0, cursoLista.size()).boxed()
				.map(i -> "(Duracion +5h) Encontrado!! : " + i + "-" + cursoLista.get(i)).forEach(System.out::println);

	}

	public void cargarObjetos() {
		cursos = new ArrayList<>();
		cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
		cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
		cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
		cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
		cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));
	}

	
	
	
	public List<Curso> getCursosConMasDe10Videos() {

		return cursos.stream().filter(c -> c.getVideos() > 10).collect(Collectors.toList());

	}

	public List<Curso> getCursosConMasDe5h() {

		return cursos.stream().filter(c -> c.getDuracion() > 5).collect(Collectors.toList());

	}

	public List<Curso> getCursosConMenos50VideosYMas300Alumnos() {

		return cursos.stream().filter(c -> c.getVideos() < 50 && c.getAlumnos() > 300).collect(Collectors.toList());

	}

}
