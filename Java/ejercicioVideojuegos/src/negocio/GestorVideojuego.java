package negocio;

import java.util.List;

import modelo.entidades.Videojuego;
import persistencia.DaoVideojuego;
import persistencia.DaoVideojuegoMysql;

public class GestorVideojuego {
	private DaoVideojuego daoVideojuego;
	private static GestorVideojuego instancia = null;
	
	public static GestorVideojuego getInstance() {
		if(instancia ==  null){
			instancia = new GestorVideojuego();//carga perezosa
		}
		return instancia;
	}
	
	public boolean alta(Videojuego v) {
		//TODO: errores personalizados
		daoVideojuego = new DaoVideojuegoMysql();
		if(daoVideojuego.buscarNombre(v.getNombre()) != null || v.getNombre().equals("") || v.getCompañia().equals("") || v.getPrecio() < 0 || v.getValoracion() < 0 || v.getValoracion() > 10 )
			return false;
		
		return daoVideojuego.alta(v);
	}
	
	public boolean eliminar(int id) {
		daoVideojuego = new DaoVideojuegoMysql();
		return daoVideojuego.eliminar(id);
		
	}
	
	public boolean modificar(Videojuego v) {
		daoVideojuego = new DaoVideojuegoMysql();
		if(daoVideojuego.buscarNombre(v.getNombre()) != null || v.getNombre().equals("") || v.getCompañia().equals("") || v.getPrecio() < -1 || v.getValoracion() < -1 || v.getValoracion() > 10 )
			return false;
		Videojuego v2 = daoVideojuego.buscarId(v.getId());
		
		if(v.getNombre().equals("-1"))
			v.setNombre(v2.getNombre());
		
		if(v.getCompañia().equals("-1"))
			v.setCompañia(v2.getCompañia());
		
		if(v.getValoracion() == -1)
			v.setValoracion(v2.getValoracion());
		
		if(v.getPrecio() == -1)
			v.setPrecio(v2.getPrecio());
		
		return daoVideojuego.modificar(v);
	}
	public Videojuego buscarId(int id) {
		daoVideojuego = new DaoVideojuegoMysql();
		return daoVideojuego.buscarId(id);
	}
	public Videojuego buscarNombre(String nombre) {
		daoVideojuego = new DaoVideojuegoMysql();
		return daoVideojuego.buscarNombre(nombre);
	}
	public List<Videojuego> listar(){
		daoVideojuego = new DaoVideojuegoMysql();
		return daoVideojuego.listar();
	}
	public int valoraciones() {
		daoVideojuego = new DaoVideojuegoMysql();
		return daoVideojuego.valoraciones();
	}
	public double precio() {
		daoVideojuego = new DaoVideojuegoMysql();
		return daoVideojuego.precio();
	}
}
