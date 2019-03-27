
public class CuentaBancaria {
	private double saldo;
	
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public CuentaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double sacarDinero(double cantidad) throws SaldoInsuficienteException {
		if(saldo < cantidad) {
			throw new SaldoInsuficienteException("Fondos insuficientes");
		}
		saldo -= cantidad;
		return cantidad;
	}
}
