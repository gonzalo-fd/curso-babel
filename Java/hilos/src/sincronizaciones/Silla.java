package sincronizaciones;

public class Silla {
	
	//synchronized bloquea el hilo para los demas hasta que este acabe
	public synchronized void ocuparSilla(Obrero o) {
		System.out.println("Ufff que cansado estoy");
		System.out.println("Soy el obrero " + o.getNombre() + " y me voy a sentar un poquitin...");
		
		try {
			Thread.sleep(5000);
			System.out.println(o.getNombre() + " - Ya he descansado suficiente");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
