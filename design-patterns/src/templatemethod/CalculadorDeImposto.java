package templatemethod;

import chainofresponsibility.Orcamento;

public class CalculadorDeImposto {
	public void realizarCalculo(Orcamento orcamento, Imposto impostoQualquer){
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}

}
