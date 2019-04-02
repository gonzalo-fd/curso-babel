package spring4;

public class Coche {
	private String marca;
	private String modelo;
	private String matricula;
	
	//Tiene que existir un contructor por defecto si queremos utilizar la
	//inicialización por propiedades
	public Coche() {
		
	}
	
	public Coche(String marca, String modelo, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}
	
	
}
