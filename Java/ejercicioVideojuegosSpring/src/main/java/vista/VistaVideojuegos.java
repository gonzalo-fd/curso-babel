package vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidades.Videojuego;
import negocio.GestorVideojuego;


public class VistaVideojuegos {
	@Autowired
	private static ApplicationContext context;
	
//	static {
//		context = new ClassPathXmlApplicationContext("beans.xml");
//	}
	
	private Scanner sc = null;
	
	@Autowired
	@Qualifier("gv")
	private GestorVideojuego gv;
	
	public void arrancar() {
		sc = new Scanner(System.in);
		gv = context.getBean(GestorVideojuego.class);
		List<Videojuego> l = null;
		int opcion = 0;
		do{
			opcion = mostrarMenu();
			switch (opcion) {
			case 1://alta
				crearVideojuego();
				break;
	
			case 2://baja
				bajaVideojuego();
				break;
				
			case 3://modificar
				System.out.println("Id del videojuego a modificar: ");
				int id = (sc.nextInt());
				modificarVideojuego(id);
				break;
				
			case 4://buscar por nombre
				buscarNombre();
				break;
				
			case 5://buscar por id
				buscarId();
				break;
			
			case 6://listar
				listarVideojuegos(l);
				break;
				
			case 7://valoracion
				System.out.println(gv.valoraciones());
				break;
				
			case 8://precio
				System.out.println(gv.precio());
				break;
			}
		}while(opcion > 0);
		
		System.out.println("Fin del programa");
	}
	
	void buscarNombre() {
		System.out.println("Nombre: ");
		String nombre = sc.next();
		Videojuego v = gv.buscarNombre(nombre);
		System.out.println(v.toString());
		
		menuBuscar(v.getId());
		
	}
	
	void buscarId() {
		System.out.println("Id: ");
		int id = sc.nextInt();
		Videojuego v = gv.buscarId(id);
		System.out.println(v.toString());
		menuBuscar(id);
		
		
	}
	
	void menuBuscar(int id) {
		
		System.out.println("1- Borrar");
		System.out.println("2- Modificar");
		System.out.println("0- Nada");
		int opcion = sc.nextInt();
		
		switch(opcion) {
		case 1: 
			gv.eliminar(id);
			break;
		case 2:
			modificarVideojuego(id);
			break;
		}
	}
	
	void listarVideojuegos(List<Videojuego> l) {
		l = gv.listar();
		for (Videojuego videojuego : l) {
			System.out.println(videojuego.toString());
		}
	}
	
	void modificarVideojuego(int id){
		Videojuego v = context.getBean("videojuego", Videojuego.class);
		v.setId(id);
		System.out.println("Nombre (-1 para no modificar): ");
		v.setNombre(sc.next());
		System.out.println("Compa�ia (-1 para no modificar): ");
		v.setCompañia(sc.next());
		System.out.println("Valoracion (-1 para no modificar): ");
		v.setValoracion(sc.nextInt());
		System.out.println("Precio (-1 para no modificar): ");
		v.setPrecio(sc.nextDouble());
		if(!gv.modificar(v))
			System.out.println("Error");
	}
	
	void crearVideojuego(){
		Videojuego v = context.getBean("videojuego", Videojuego.class);
		System.out.println("Nombre: ");
		v.setNombre(sc.next());
		System.out.println("Compa�ia: ");
		v.setCompañia(sc.next());
		System.out.println("Valoracion: ");
		v.setValoracion(sc.nextInt());
		System.out.println("Precio: ");
		v.setPrecio(sc.nextDouble());
		if(!gv.alta(v))
			System.out.println("Error");
	}
	
	void bajaVideojuego() {
		System.out.println("Id: ");
		if(!gv.eliminar(sc.nextInt()))
			System.out.println("Error");
	}
	
	int mostrarMenu() {
		System.out.println("1 - Alta");
		System.out.println("2 - Baja");
		System.out.println("3 - Modificar");
		System.out.println("4 - Buscar por nombre");
		System.out.println("5 - Buscar por id");
		System.out.println("6 - Listar");
		System.out.println("7 - Valoraci�n media");
		System.out.println("8 - Precio medio");
		System.out.println("-1 - Salir");
		return sc.nextInt();

	}
}
