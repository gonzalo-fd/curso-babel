package modelo.negocio;

import java.util.List;

import modelo.entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPelicula {
	private DaoPelicula daoPelicula;
	
	public boolean insertar(Pelicula p) {
		if(!"".equals(p.getTitulo()))
			return daoPelicula.insertar(p);
		return false;
	}
	
	public List<Pelicula> listar(){
		return daoPelicula.listar();
	}
}
