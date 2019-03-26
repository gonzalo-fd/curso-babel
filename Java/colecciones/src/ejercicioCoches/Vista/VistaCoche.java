package ejercicioCoches.Vista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import ejercicioCoches.Comparadores.cmpKm;
import ejercicioCoches.Comparadores.cmpMarca;
import ejercicioCoches.Comparadores.cmpMatricula;
import ejercicioCoches.Entidades.Coche;
import ejercicioCoches.Negocio.GestorCoche;


public class VistaCoche {

	private Scanner sc = null;
	private GestorCoche gc = null;
	
	public void arrancar() {
		sc = new Scanner(System.in);
		gc = new GestorCoche();
		int opcion = 0;
		do{
			opcion = menu();
			switch (opcion) {
			case 1://add
				add();
				break;
	
			case 2://Listar por matricula
				listarMatricula();
				break;
			
			case 3://Listar por marca
				listarMarca();
				break;
			case 4://Listar por km
				listarKm();
				break;			
			}
		}while(opcion != -1);
		
		System.out.println("Fin del programa");
	}
	
	private void listarMatricula() {
		List<Coche> lista = gc.getLista();
		Collections.sort(lista, new cmpMatricula());
		for (Coche coche : lista) {
			System.out.println(coche);
		}
	}
	private void listarMarca() {
		List<Coche> lista = gc.getLista();
		Collections.sort(lista, new cmpMarca());
		for (Coche coche : lista) {
			System.out.println(coche);
		}
	}
	private void listarKm() {
		List<Coche> lista = gc.getLista();
		Collections.sort(lista, new cmpKm());
		for (Coche coche : lista) {
			System.out.println(coche);
		}
	}
	
	private void add() {
		System.out.println("Matricula");
		String matricula = sc.next();
		
		System.out.println("Marca");
		String marca = sc.next();
		
		System.out.println("Modelo");
		String modelo = sc.next();
		
		System.out.println("Kilometros");
		Double km = sc.nextDouble();
		
		Coche c = new Coche(matricula, marca, modelo, km);
		
		gc.add(c);
	}
	
	private int menu() {
		System.out.println("Agregar: 1");
		System.out.println("Listar por matricula: 2");
		System.out.println("Listar por marca: 3");
		System.out.println("Listar por kilometros: 4");
		System.out.println("Salir: -1");
		int opcion = sc.nextInt();
		return opcion;
	}
}
