package hilos;

public class MainRunnable {

	public static void main(String[] args) {
		HiloRunnable hilo1 = new HiloRunnable("hilo 1", 30);
		HiloRunnable hilo2 = new HiloRunnable("hilo 2", 25);
		HiloRunnable hilo3 = new HiloRunnable("hilo 3", 40);
		
		Thread t1 = new Thread(hilo1);
		Thread t2 = new Thread(hilo1);
		Thread t3 = new Thread(hilo3);
	}

}
