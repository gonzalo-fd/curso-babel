package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import config.Configuracion;
import modelo.entidades.Coche;
import modelo.negocio.GestorCoche;

public class MainJdbcTemplate {
	
	private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorCoche gc = context.getBean("gestorCoche", GestorCoche.class);
		System.out.println(gc.listar());
			
	}

}
