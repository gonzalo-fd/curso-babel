package ejercicioCoches.Comparadores;

import java.util.Comparator;

import ejercicioCoches.Entidades.Coche;

public class cmpMatricula implements Comparator<Coche> {

	public cmpMatricula() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getMatricula().compareTo(o2.getMatricula());
	}

}
