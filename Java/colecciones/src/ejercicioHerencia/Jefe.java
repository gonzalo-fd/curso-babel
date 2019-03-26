package ejercicioHerencia;


public class Jefe extends Empleado {

	private double incentivo;

	public Jefe(String nombre, double salario, double incentivo) {
		super(nombre, salario);
		this.incentivo = incentivo;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return super.calcularSalario() + this.incentivo;
	}

	@Override
	public String toString() {
		return "Jefe [toString()=" + super.toString() + ", incentivo=" + incentivo + "]";
	}
	
	
}
