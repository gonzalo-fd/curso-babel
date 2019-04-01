package modelo.entidades;

public class Videojuego {

	private int id;
	private String nombre;
	private String compa�ia;
	private int valoracion;
	private double precio;
	
	public Videojuego(int id, String nombre, String compa�ia, int valoracion, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.compa�ia = compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
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
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compa�ia=" + compa�ia + ", valoracion=" + valoracion
				+ ", precio=" + precio + "]";
	}
	
	
	
}
