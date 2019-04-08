package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import config.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainJdbcTemplate {
	
	private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorPelicula gp = context.getBean("gestorPelicula", GestorPelicula.class);
		System.out.println(gp.buscar(456));
//		Pelicula p = context.getBean("pelicula", Pelicula.class);
//		p.setTitulo("titulo");
//		p.setGenero("fghj");
//		p.setYear(9831);
//		p.setDirector("ahhhhhhhh");
		
		//gp.insertar(p);
		
//		p.setId(1);
//		p.setTitulo("otro");
//		
//		//gp.modificar(p);
//		
//		Pelicula p2 = gp.buscar(p.getId());
//		System.out.println(p2);
//		
	}

}
