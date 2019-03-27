package hilos;

public class HiloRunnable implements Runnable{
	
	private String nombreHilo;
	private int numeroIteraciones;
	
	public HiloRunnable(String nombreHilo, int numeroIteraciones) {
		this.nombreHilo = nombreHilo;
		this.numeroIteraciones = numeroIteraciones;
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
