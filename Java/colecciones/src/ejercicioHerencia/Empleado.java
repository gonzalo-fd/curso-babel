package ejercicioHerencia;

public abstract class Empleado {
	private String nombre;
	private double salario;	
	
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public double calcularSalario() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
