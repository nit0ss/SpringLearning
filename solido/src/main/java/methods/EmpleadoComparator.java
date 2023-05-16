package methods;

import java.util.Comparator;

import solido.Empleado;

public class EmpleadoComparator implements Comparator<Empleado> {

	public int compareTo(Empleado empleado1, Empleado empleado2) {
		/*
		 * int categoriaComparison = Integer.compare(empleado1.getCategoria(),
		 * empleado2.getCategoria()); if (categoriaComparison != 0) { return
		 * categoriaComparison; }
		 */

		int salarioComparison = Long.compare(empleado2.getSalario(), empleado1.getSalario());

		if (salarioComparison == 0) {
			return salarioComparison;
		}

		return (empleado1).getNombre().compareTo(empleado2.getNombre());
	}

	public int compare(Empleado empleado1, Empleado empleado2) {
		return Long.compare(empleado1.getSalario(), empleado2.getSalario());
	}

}
