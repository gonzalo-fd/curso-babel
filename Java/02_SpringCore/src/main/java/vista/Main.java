package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class Main {
	
	public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula p = context.getBean("pelicula", Pelicula.class);
		p.setTitulo("star wars");
		p.setGenero("culto");
		p.setYear(1975);
		System.out.println(p);
		
//		GestorPelicula gp = context.getBean("gestorPelicula", GestorPelicula.class);
//		gp.insertar(p);
	}

}
