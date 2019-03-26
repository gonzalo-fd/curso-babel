package ejercicioCoches.Persistencia;

import java.util.ArrayList;
import java.util.List;

import ejercicioCoches.Entidades.Coche;


public class DaoCoche {
	
	private static List<Coche> lista = new ArrayList<>();
	
	public boolean add(Coche c) {
		lista.add(c);
		return true;
	}
	
	public List<Coche> getLista() {
		return lista;
	}
}
