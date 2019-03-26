package ejercicioCoches.Comparadores;

import java.util.Comparator;

import ejercicioCoches.Entidades.Coche;

public class cmpKm implements Comparator<Coche> {

	public cmpKm() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Coche o1, Coche o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getKm() - o2.getKm());
	}

}
