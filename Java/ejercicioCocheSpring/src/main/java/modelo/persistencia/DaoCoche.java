package modelo.persistencia;

import java.util.List;

import modelo.entidades.Coche;

public interface DaoCoche {
	int insertar(Coche c);
	int modificar(Coche c);
	public int borrar(String matricula);
	Coche buscar(String matricula);
	List<Coche> listar();
}
