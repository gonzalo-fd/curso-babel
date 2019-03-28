package negocio;

import java.util.List;

import modelo.entidades.Persona;
import persistencia.DaoPersona;
import persistencia.DaoPersonaMysql;

public class GestorPersona {
	private DaoPersona daoPersona;
	
	public boolean alta(Persona p) {
		daoPersona = new DaoPersonaMysql();
		return daoPersona.alta(p);
	}
	
	public boolean eliminar(int id) {
		daoPersona = new DaoPersonaMysql();
		return daoPersona.eliminar(id);
	}
	
	public boolean modificar(Persona p) {
		daoPersona = new DaoPersonaMysql();
		return daoPersona.modificar(p);
	}
	
	public Persona get(int id) {
		daoPersona = new DaoPersonaMysql();
		return daoPersona.get(id);
	}
	
	public List<Persona> listar() {
		daoPersona = new DaoPersonaMysql();
		return daoPersona.listar();
	}
	
}
