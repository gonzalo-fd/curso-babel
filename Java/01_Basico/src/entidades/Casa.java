package entidades;

import java.util.Arrays;

public class Casa {
	
	int precio;
	Direccion direccion;
	Persona propietario;
	boolean estaAlquilada;
	Habitacion[] habitaciones;
	Persona[] inquilinos;
	
	public Casa(int precio, Direccion direccion, Persona propietario, boolean estaAlquilada, Habitacion[] habitaciones,
			Persona[] inquilinos) {
		super();
		this.precio = precio;
		this.direccion = direccion;
		this.propietario = propietario;
		this.estaAlquilada = estaAlquilada;
		this.habitaciones = habitaciones;
		this.inquilinos = inquilinos;
	}

	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", direccion=" + direccion + ", propietario=" + propietario
				+ ", estaAlquilada=" + estaAlquilada + ", habitaciones=" + Arrays.toString(habitaciones)
				+ ", inquilinos=" + Arrays.toString(inquilinos) + "]";
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public boolean isEstaAlquilada() {
		return estaAlquilada;
	}

	public void setEstaAlquilada(boolean estaAlquilada) {
		this.estaAlquilada = estaAlquilada;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona[] getInquilinos() {
		return inquilinos;
	}

	public void setInquilinos(Persona[] inquilinos) {
		this.inquilinos = inquilinos;
	}
	
	
}
