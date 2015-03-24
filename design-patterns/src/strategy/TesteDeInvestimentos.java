package strategy;


public class TesteDeInvestimentos {
	public static void main(String[] args) {
		Investimento moderado = new Moderado();
		Investimento conservador = new Consevador();
		Investimento arrojado = new Arrojado();
		
		Conta conta = new Conta();
		conta.deposita(1000);
		
		RealizadorDeInvestimentos investimento = new RealizadorDeInvestimentos();
		
		investimento.realiza(conta, conservador);
		investimento.realiza(conta, moderado);
		investimento.realiza(conta, arrojado);
	}

}
