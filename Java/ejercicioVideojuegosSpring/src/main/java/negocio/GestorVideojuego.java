package negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import modelo.entidades.Videojuego;
import persistencia.DaoVideojuego;
import persistencia.DaoVideojuegoMysql;
import vista.Main;
@Service
public class GestorVideojuego {
	@Autowired
	private static ApplicationContext context;
	
//	static {
//		context = new ClassPathXmlApplicationContext("beans.xml");
//	}
//	@Autowired
//	@Qualifier("daoVideojuego")
	private DaoVideojuego daoVideojuego;
	@Autowired
	@Qualifier("daoVideojuegoMysql")
	private DaoVideojuegoMysql daoVideojuegoMysql;
	
//	private static GestorVideojuego instancia = null;
//	
//	public static GestorVideojuego getInstance() {
//		if(instancia ==  null){
//			instancia = new GestorVideojuego();//carga perezosa
//		}
//		return instancia;
//	}
	
	public boolean alta(Videojuego v) {
		//TODO: errores personalizados
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
		if(daoVideojuego.buscarNombre(v.getNombre()) != null || v.getNombre().equals("") || v.getCompañia().equals("") || v.getPrecio() < 0 || v.getValoracion() < 0 || v.getValoracion() > 10 )
			return false;
		
		return daoVideojuego.alta(v);
	}
	
	public boolean eliminar(int id) {
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
		return daoVideojuego.eliminar(id);
		
	}
	
	public boolean modificar(Videojuego v) {
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
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
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
		return daoVideojuego.buscarId(id);
	}
	public Videojuego buscarNombre(String nombre) {
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
		return daoVideojuego.buscarNombre(nombre);
	}
	public List<Videojuego> listar(){
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
		return daoVideojuego.listar();
	}
	public int valoraciones() {
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
		return daoVideojuego.valoraciones();
	}
	public double precio() {
		daoVideojuego = context.getBean("daoVideojuegoMysql", DaoVideojuegoMysql.class);
		return daoVideojuego.precio();
	}
}
