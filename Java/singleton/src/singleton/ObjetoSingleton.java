package singleton;


/* se busca realizar una sola instancia del objeto (hacer muchos news es mucho gasto) y poder acceder
 * a el desde cualquier parte
 */
public class ObjetoSingleton {
	private static ObjetoSingleton instancia = null;
	private String nombre;
	
	private ObjetoSingleton() {
		super();
	}
	
	public static ObjetoSingleton getInstance() {
		if(instancia ==  null){
			instancia = new ObjetoSingleton();//carga perezosa
		}
		return instancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
