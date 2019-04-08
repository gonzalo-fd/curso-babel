package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Coche;
import modelo.persistencia.DaoCoche;

@Service
public class GestorCoche {
	@Autowired
	DaoCoche daoCoche;
	
	public int insertar(Coche c) {
		if(!"".equals(c.getMatricula())) {
			return daoCoche.insertar(c);
		}
		return -1;
	}
	
	public int modificar(Coche c) {
		if(!"".equals(c.getMatricula())) {
			return daoCoche.modificar(c);
		}
		return -1;
	}
	
	public int borrar(String matricula) {
		return daoCoche.borrar(matricula);
	}
	
	public Coche buscar(String matricula) {
		return daoCoche.buscar(matricula);
	}
	
	public List<Coche> listar(){
		return daoCoche.listar();
	}
}
