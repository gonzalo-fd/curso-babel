package es.babel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import es.babel.modelo.gestion.GestorHistoria;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Application.class, args);	
		GestorHistoria gh = context.getBean("gestorHistoria",GestorHistoria.class);
		System.out.println(gh.getHistoria());
	}

}
