package colecciones;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// List interfaz clase lista
		List<String> listaString = new ArrayList<>();
		listaString.add("Ana");
		listaString.add("Pepe");
		listaString.add("Edu");
		listaString.add("Edu");
		
		for (String string : listaString) {
			System.out.println(string);
		}
		
		System.out.println(listaString.get(0));//Ana
		
		listaString.remove("Ana");
		
		System.out.println(listaString.size());
		
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Ana");
		conjunto.add("Pepe");
		conjunto.add("Edu");
		conjunto.add("Edu");
		
		for (String string : conjunto) {
			System.out.println(string);
		}
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Felix");
		mapa.put(2, "Feliciano");
		
		String s = mapa.get(1);
		
	}																				
}
