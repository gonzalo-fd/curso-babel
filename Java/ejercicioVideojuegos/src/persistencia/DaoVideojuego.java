package persistencia;

import java.util.List;

import modelo.entidades.Videojuego;

public interface DaoVideojuego {
	
	boolean alta(Videojuego v);
	boolean eliminar(int id);
	boolean modificar(Videojuego v);
	Videojuego buscarId(int id);
	Videojuego buscarNombre(String nombre);
	List<Videojuego> listar();
	int valoraciones();
	double precio();
}
