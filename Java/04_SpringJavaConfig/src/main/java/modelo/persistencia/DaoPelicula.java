package modelo.persistencia;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import modelo.entidades.Pelicula;

@Repository
public class DaoPelicula {
	private List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

	public boolean insertar(Pelicula p) {
		return listaPeliculas.add(p);
	}
	
	public List<Pelicula> listar(){
		return listaPeliculas;
	}
}
