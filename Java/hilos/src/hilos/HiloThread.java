package hilos;

public class HiloThread extends Thread{
	
	private String nombreHilo;
	private int numeroIteraciones;

	public HiloThread(String nombreHilo, int numeroIteraciones) {
		super();
		this.nombreHilo = nombreHilo;
		this.numeroIteraciones = numeroIteraciones;
	}

	public HiloThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("arrancando el hilo " + nombreHilo);
		
		for (int i = 1; i <= numeroIteraciones; i++) {
			System.out.println(nombreHilo + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("hilo " + nombreHilo + " finalizando...");
	}
	
	
}
