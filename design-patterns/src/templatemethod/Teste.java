package templatemethod;

import chainofresponsibility.Item;
import chainofresponsibility.Orcamento;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Imposto ihit = new IHIT();
		
		Orcamento orcamento = new Orcamento(500.00);
		orcamento.adicionaItem(new Item("CANETA", 250.00));
		orcamento.adicionaItem(new Item("LAPIS", 250.00));
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizarCalculo(orcamento, icpp);
		calculador.realizarCalculo(orcamento, ikcv);
		calculador.realizarCalculo(orcamento, ihit);
		

	}

}
