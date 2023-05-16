package solido;

public class Empleado implements Comparable {
	int id;
	String nombre;
	long salario;
	int categoria;

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Empleado(int id, String nombre, long salario, int categoria) {
		// super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
}
