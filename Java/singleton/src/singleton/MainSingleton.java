package singleton;

public class MainSingleton {

	public static void main(String[] args) {
		ObjetoSingleton os = ObjetoSingleton.getInstance();
		os.setNombre("asdf");
		obtenerNombre(os);
		obtenerNombre();
		
	}
	
	private static void obtenerNombre(ObjetoSingleton os) {
		System.out.println(os.getNombre().toString());
	}
	
	private static void obtenerNombre() {
		System.out.println(ObjetoSingleton.getInstance().getNombre());
	}
}
