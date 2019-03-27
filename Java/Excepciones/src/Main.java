import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca dos numeros para dividir");
				int dividendo = sc.nextInt();
				int divisor = sc.nextInt();
				int resultado = dividendo / divisor;
				System.out.println("Resultado: " + resultado);
			} catch (InputMismatchException ime) {
				System.out.println("Ha introducido un valor no numerico");
			}
			catch(ArithmeticException ae) {
				System.out.println("El divisor no puede ser 0");
			}
			catch(Exception e) {
				System.out.println("Algun tipo de excepcion");
			}
			finally {
				//se ejecuta siempre
			}
			
			CuentaBancaria cb = new CuentaBancaria(1000);
			
			try {
				cb.sacarDinero(1200);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FileWriter fw = null;
			PrintWriter pw = null;
			try {
				 fw = new FileWriter("fichero.txt");
				 pw = new PrintWriter(fw);
				pw.println("prueba");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(pw != null) {
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			//bloques try autoclosable
			try(FileWriter fw2 = new FileWriter("fichero2.txt");
					PrintWriter pw2 = new PrintWriter(fw2)) {
						pw.println("Prueba2");
					//ahora no hace falta cerrar el bloque 
					}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
	}

}
