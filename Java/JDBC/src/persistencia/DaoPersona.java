package persistencia;

import java.util.List;

import modelo.entidades.Persona;

public interface DaoPersona {
	boolean alta(Persona p);
	boolean eliminar(int id);
	boolean modificar(Persona p);
	Persona get(int id);
	List<Persona> listar();
}
