package modelo.entidades;

public class Videojuego {

	private int id;
	private String nombre;
	private String compañia;
	private int valoracion;
	private double precio;
	
	public Videojuego(int id, String nombre, String compañia, int valoracion, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.compañia = compañia;
		this.valoracion = valoracion;
		this.precio = precio;
	}

	public Videojuego() {
		// TODO Auto-generated constructor stub
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

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compañia=" + compañia + ", valoracion=" + valoracion
				+ ", precio=" + precio + "]";
	}
	
	
	
}
