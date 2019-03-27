package sincronizaciones;

public class ValsObrero {

	public static void main(String[] args) {
		
		Silla silla = new Silla();
		
		Obrero o1 = new Obrero("Currito", 1, 100, silla);
		Obrero o2 = new Obrero("MalaSombra", 1, 100, silla);
		Obrero o3 = new Obrero("Currometro", 1, 100, silla);
		Obrero o4 = new Obrero("MuertoHambre", 1, 100, silla);
		Obrero o5 = new Obrero("Legalegalizacion", 1, 100, silla);
		
		new Thread(o1).start();
		new Thread(o2).start();
		new Thread(o3).start();
		new Thread(o4).start();
		new Thread(o5).start();
	}
}
