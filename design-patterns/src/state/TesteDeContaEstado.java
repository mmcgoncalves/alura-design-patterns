package state;

public class TesteDeContaEstado {

	public static void main(String[] args) {
		Conta conta = new Conta(500.0);
		
		conta.deposita(100.00);
		
		System.out.println(conta.getSaldo());
		
		conta.saca(500.00);
		
		System.out.println(conta.getSaldo());
		
		conta.saca(99.00);
		
		System.out.println(conta.getSaldo());
		//Se torna uma conta em negativo
		conta.saca(99.00);
		
		System.out.println(conta.getSaldo());
		
		
	}

}
