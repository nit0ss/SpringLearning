package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import methods.EmpleadoComparator;
import solido.Empleado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> empleados = Arrays.asList(
	            new Empleado(1, "Juan", 30000, 2),
	            new Empleado(2, "María", 60000, 1),
	            new Empleado(3, "Carlos", 50000, 1)
	        );
		/*
		empleados.add(a);
		empleados.add(b);
		empleados.add(c);
		*/
		Collections.sort(empleados, (p1, p2) -> (int)(p1.getSalario() - p2.getSalario()));


		for (Empleado empleado : empleados) {
			System.out.println(empleado.getNombre() +" "+ empleado.getSalario());
		}
	}

}
