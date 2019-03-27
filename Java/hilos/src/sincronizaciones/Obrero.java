package sincronizaciones;

public class Obrero implements Runnable{
	
	private String nombre;
	private int metrosIniciales;
	private int metrosFinales;
	private Silla silla;
	
	public Obrero(String nombre, int metrosIniciales, int metrosFinales, Silla silla) {
		super();
		this.nombre = nombre;
		this.metrosIniciales = metrosIniciales;
		this.metrosFinales = metrosFinales;
		this.setSilla(silla);
	}
	
	public void construirValla() {
		for (int i = metrosIniciales; i < metrosFinales; i++) {
			System.out.println("Obrero " + nombre + " poniendo ladrillos en el metro " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i % 10 == 0) {
				silla.ocuparSilla(this);
			}
		}
	}

	@Override
	public void run() {
		construirValla();		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMetrosIniciales() {
		return metrosIniciales;
	}

	public void setMetrosIniciales(int metrosIniciales) {
		this.metrosIniciales = metrosIniciales;
	}

	public int getMetrosFinales() {
		return metrosFinales;
	}

	public void setMetrosFinales(int metrosFinales) {
		this.metrosFinales = metrosFinales;
	}

	public Silla getSilla() {
		return silla;
	}

	public void setSilla(Silla silla) {
		this.silla = silla;
	}
	
	
}
