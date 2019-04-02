package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;

@Configuration
public class Configuracion {
	@Bean
	@Scope("prototype")
	public Pelicula pelicula(Director director) {
		/*por defecto hace autowire por tipo al parametro de entrada, si no existe directgor sera null*/
		Pelicula p = new Pelicula();
		p.setDirector(director);
		return p;
	}
	@Bean
	@Scope("prototype")
	public Director director() {
		Director p = new Director();
		p.setNombre("georgie");
		return p;
	}
	
	@Bean("daoPelicula")//podemos cambiar el id del bean
	public DaoPelicula crearDaoPelicula() {
		DaoPelicula daoPelicula = new DaoPelicula();
		return daoPelicula;
	}
	//si tuvieramos varios daos con qualifier podemos decir cual usar
	@Bean
	public GestorPelicula gestorPelicula(DaoPelicula daoPelicula) {
		GestorPelicula gp = new GestorPelicula();
		gp.setDaoPelicula(daoPelicula);
		return gp;
	}
}
