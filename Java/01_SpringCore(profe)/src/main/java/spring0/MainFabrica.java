package spring0;

public class MainFabrica {

	public static void main(String[] args) {
		String modo = args[0];
		Imprimir i = FabricaImprimibles.crear(modo);
		i.imprimir("Ola ke ase");
		
		/*
		if(modo.equals("1")) {
			//arrancar en modo fichero
			ImprimirPorFichero ipm = FabricaImprimibles.crear("fichero");
			ipm.imprimir("ola ke ase");
			
		}else {
			ImprimirPorPantalla ipp = new ImprimirPorPantalla();
			ipp.imprimir("ola ke ase");
		}*/
	}

}
