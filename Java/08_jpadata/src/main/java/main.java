import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cfg.Configuracion;
import modelo.entidades.Pelicula;
import modelo.persistencia.PeliculaDao;

public class main {
	
	private static ApplicationContext context;
		
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeliculaDao peliculaDao = context.getBean("peliculaDao", PeliculaDao.class);
		
		while(true) {
		Pelicula p = new Pelicula();
		p.setTitulo("Oleh la chupa");
		p.setDirector("feo");
		p.setAno(69);
		p.setGenero("toma puto genero");
		
		peliculaDao.save(p);
		}
//		p = new Pelicula();
//		p.setTitulo("qwerty");
//		p.setDirector("tu");
//		p.setAno(4321);
//		
//		peliculaDao.save(p);
		
//		List<Pelicula> list = peliculaDao.findAll();
//		System.out.println(list);
	}

}
