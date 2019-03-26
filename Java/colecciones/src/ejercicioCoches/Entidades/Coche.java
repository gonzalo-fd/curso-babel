package ejercicioCoches.Entidades;

public class Coche {

	String matricula;
	String marca;
	String modelo;
	double km;
	
	public Coche(String matricula, String marca, String modelo, double km) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + "]";
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	
}
