package entidades;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direccion dir = new Direccion("Calle", "Manuela Malasaña", "28004", "España");
		
		Persona p1 = new Persona(180, "Pedro", 23, dir);
		Persona p2 = new Persona(185, "Sofia", 28, dir);
		Persona p3= new Persona(168, "Gonzalo", 33, dir);
		Persona p4 = new Persona(157, "Beatriz", 19, dir);
		Persona[] arrPer = {p1, p2, p3, p4};
		
		Habitacion h1 = new Habitacion(6, "Individual");
		Habitacion h2 = new Habitacion(9, "Doble");
		Habitacion h3 = new Habitacion(14, "Individual");
		Habitacion[] arrHab = {h1, h2, h3};
		
		Casa casa = new Casa(500000, dir, p1, true, arrHab, arrPer);
		System.out.println(casa);
	}

}
