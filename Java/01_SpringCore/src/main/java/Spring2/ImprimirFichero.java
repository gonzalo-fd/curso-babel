package Spring2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimir{

	public void imprimir(String texto) {
		try (
			FileWriter fw = new FileWriter("fichero.txt");
			PrintWriter pw = new PrintWriter(fw)) {
			pw.print(texto);}
		 catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}
}
