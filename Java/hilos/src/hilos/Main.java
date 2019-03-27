package hilos;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloThread hilo1 = new HiloThread("Hilo 1", 25);
		HiloThread hilo2 = new HiloThread("Hilo 2", 20);
		HiloThread hilo3 = new HiloThread("Hilo 3", 15);
		
		hilo2.setPriority(1);//esto no funciona bien
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		System.out.println("hilo main finalizado");
	}

}
