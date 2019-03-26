package entidades;

import java.util.Comparator;

public class CompararPersonaPorNombre implements Comparator<Persona>{

	public CompararPersonaPorNombre() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
