package Genericos;

public class Almacen2<T extends Object> {//podemos extender de lo que queraos pero solo podremos usar sus metodos

	private T valor;
	
	
	public T getValor() {
		return valor;
	}


	public void setValor(T valor) {
		this.valor = valor;
	}


	public Almacen2() {
		// TODO Auto-generated constructor stub
	}

}
