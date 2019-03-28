package vista;

import modelo.entidades.Persona;
import negocio.GestorPersona;

public class MainJDBC {

	public static void main(String[] args) {
		
	GestorPersona gp = new GestorPersona();
		
//		Persona p = new Persona();
//		p.setNombre("Syd");
//		p.setEdad(79);
//		p.setPeso(78.9);
//		p.setId(1);
//		
//		gp.alta(p);
//		
//		p.setNombre("Barret");
//		p.setEdad(60);
//		gp.modificar(p);
//		
//		System.out.println(gp.get(1).toString());
//		
//		p = new Persona();
//		p.setNombre("waters");
//		p.setEdad(79);
//		p.setPeso(78.9);
//		gp.alta(p);
		System.out.println(gp.listar());
	}

}
