package state;

public class Conta {
	protected double saldo;
	protected EstadoDaConta estado;

	public Conta(double saldo) {
		this.saldo = saldo;
		this.estado = new Positivo();
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}

	public void deposita(double valor) {
		estado.deposita(this, valor);
	}

	public double getSaldo() {
		return saldo;
	}

}
