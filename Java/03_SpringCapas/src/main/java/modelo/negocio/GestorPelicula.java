package modelo.negocio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import modelo.entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

@Service
public class GestorPelicula {
	@Autowired
	@Qualifier("daoPelicula")
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
