package Inicio;

public class MainFabrica {

	public static void main(String[] args) {
		String mode = args[0];
		Imprimir i = FabricaImprimir.crear(mode);
		i.imprimir("En que a�o estamos??");
		/*if(mode.equals("1")) {
			ImprimirFichero imf = new ImprimirFichero();
			imf.imprimir("En que a�o estamos??");
		}else {
			ImprimirPantalla imp = new ImprimirPantalla();
			imp.imprimir("Cuanto es 1 + 1 ??");
		}*/
	}
}
