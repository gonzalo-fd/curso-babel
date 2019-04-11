package es.babel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.babel.modelo.entidades.Pelicula;
import es.babel.modelo.negocio.GestorPelicula;

/*
 * @Configuration-> esta clase esta preparada para llevar beans de spring 
 * 
 * @ComponentScan-> busca anotaciones de spring desde un package
 * 
 * @EnabledAutoConfiguration-> spring arranca la app, metiendo en el contenedor todos los beans
 * que necesite para que funcione. Le decimos que va a ser una app jpa(contiene dataSource)
 * Spring creara el objeto automaticamente
 * */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Pelicula p1 = context.getBean("pelicula",Pelicula.class);
		p1.setTitulo("hola caracola"); p1.setDirector("feo");
		p1.setGenero("llorar"); p1.setYear(2000);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		gp.create(p1);
		System.out.println(gp.list());
		System.out.println(gp.read(1));
		
	}

}
