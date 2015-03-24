package strategy;


public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto icms = new ICMS();		
		Imposto iss = new ISS();
		Imposto novoImposto = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.00);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizarCalculo(orcamento, icms);		
		calculador.realizarCalculo(orcamento, iss);
		calculador.realizarCalculo(orcamento, novoImposto);
	}

}
