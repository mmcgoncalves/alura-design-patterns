package chainofresponsibility;

public class TesteDeDesconto {

	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.00));
		orcamento.adicionaItem(new Item("LAPIS", 250.00));
		
		double descontoFinal = calculador.calcula(orcamento);
		
		System.out.println(descontoFinal);
		
		
	}

}
