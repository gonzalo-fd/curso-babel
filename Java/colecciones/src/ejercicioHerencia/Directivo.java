package ejercicioHerencia;

public class Directivo extends Empleado{

	private double extra;
	private int numEmpleados;
	
	
	public Directivo(String nombre, double salario, double extra, int numEmpleados) {
		super(nombre, salario);
		this.extra = extra;
		this.numEmpleados = numEmpleados;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + numEmpleados * extra;
	}

	@Override
	public String toString() {
		return "Directivo [toString()=" + super.toString() + ", extra=" + extra + ", numEmpleados=" + numEmpleados
				+ "]";
	}
	
	
}
