package ejercicioCoches.Negocio;

import java.util.ArrayList;
import java.util.List;

import ejercicioCoches.Entidades.Coche;
import ejercicioCoches.Persistencia.DaoCoche;


public class GestorCoche {

	List<String> lista = new ArrayList<>();
	
	public List<Coche> getLista() {
		return new DaoCoche().getLista();
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public boolean add(Coche c) {//deberia devolver errores
		
		if(c.getMatricula().length() != 7 || lista.contains(c.getMatricula()))
			return false;
		
		lista.add(c.getMatricula());
		return 	new DaoCoche().add(c);
		
	}

}
