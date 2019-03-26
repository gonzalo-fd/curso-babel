package ejercicioCoches.Comparadores;

import java.util.Comparator;

import ejercicioCoches.Entidades.Coche;

public class cmpMarca implements Comparator<Coche>{

	public cmpMarca() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Coche o1, Coche o2) {
		// TODO Auto-generated method stub
		return o1.getMarca().compareTo(o2.getMarca());
	}

}
