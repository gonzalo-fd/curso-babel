package gestores;

import entidades.Pedido;
import entidades.Pizza;


public class GestorPedido {

	public boolean pedir(Pedido p) {
		if(p.getDireccion().equalsIgnoreCase("") || p.getPizza()==null)
			return false;
		return true;
	}

	public double calculaPrecio(Pizza p) {
		double precio = 0;
		if(p.getTama�o().equals("peque�o"))precio=5;
		else if(p.getTama�o().equals("mediano"))precio=10;
		else precio=15;
		
		return precio+p.getIngredientes().size()*2;
	}

	
}
