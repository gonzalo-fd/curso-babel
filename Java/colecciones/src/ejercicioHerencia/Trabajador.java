package ejercicioHerencia;

public class Trabajador extends Empleado{
	
	public Trabajador(String nombre, double salario) {
		super(nombre, salario);
	}
	

	@Override
	public String toString() {
		return "Trabajador [toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario();
	}
	
}
