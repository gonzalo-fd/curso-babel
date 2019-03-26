package ejercicioHerencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		List<Empleado> listaEmpleados = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Alta: 0 Baja: 1 Listar: 2 Nominas: 3 Salir -1");
			n = sc.nextInt();
			
			if(n == 0) {
				listaEmpleados = main.alta(listaEmpleados);
			}
			else if(n == 1) {
				System.out.println("Nombre: ");
				String nombre = sc.next();
				listaEmpleados = main.baja(nombre, listaEmpleados);
			}
			else if (n == 2)
				main.listar(listaEmpleados);
			else if(n == 3)
				main.nominas(listaEmpleados);
		}while(n != -1);
			
		
	}

	public List<Empleado> alta(List<Empleado> listaEmpleados){		
			
			Scanner sc = new Scanner(System.in);		
			
			System.out.println("Tipo empleado 0: trabajador, 1: jefe, 2: directivo");
			int tipo = sc.nextInt();
			
			String nombre;
			do {

			System.out.println("Nombre: ");
			nombre = sc.next();
			}while(nombre.equals(""));
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
		
						
			if(tipo == 0) {
				Trabajador t = new Trabajador(nombre, salario);
				listaEmpleados.add(t);
			}
			else if(tipo == 1) {
				System.out.println("Incentivo: ");
				double incentivo = sc.nextDouble();
				Jefe j = new Jefe(nombre, salario, incentivo);
				listaEmpleados.add(j);
			}
			else if(tipo == 2) {
				System.out.println("Extra: ");
				double extra = sc.nextDouble();
				
				System.out.println("Numero empleados: ");
				int numEmpleados = sc.nextInt();
				
				Directivo d = new Directivo(nombre, salario, extra, numEmpleados);
				listaEmpleados.add(d);
			}
			return listaEmpleados;
	}
	
	public void listar(List<Empleado> listaEmpleados) {
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado.toString());
		}
	}
	
	public void nominas(List<Empleado> listaEmpleados) {
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado + ": " + empleado.calcularSalario());	
		}
	}
	
	public List<Empleado> baja(String nombre, List<Empleado> listaEmpleados) {
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if(listaEmpleados.get(i).getNombre().equals(nombre))
				listaEmpleados.remove(i);
		}
		return listaEmpleados;
	}
}
