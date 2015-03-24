package chainofresponsibility;

import java.util.Calendar;

public class Conta {
	private String titular;
	private double saldo;
	private Calendar dataDeAbertura = Calendar.getInstance();

	public Calendar getDataDeAbertura() {
		return dataDeAbertura;
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
