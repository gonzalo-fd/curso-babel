package Spring6;

import Casa.Direccion;

public class Persona {

	private String nombre;
	private double peso;
	private int edad;
	private Direccion direccion;
	
	public static int numeroPersona;
	
	public Persona(String n,double a,int e,Direccion d) {
		this.peso = a;
		this.nombre = n;
		this.edad = e;
		this.direccion = d;
	}
	
	
	public static int getNumeroPersona() {
		return numeroPersona;
	}

	public static void setNumeroPersona(int numeroPersona) {
		Persona.numeroPersona = numeroPersona;
	}

	
	public Persona() {}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", direccion=" + direccion + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double altura) {
		this.peso = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
