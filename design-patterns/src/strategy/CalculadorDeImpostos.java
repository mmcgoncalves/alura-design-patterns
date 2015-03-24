package strategy;

public class CalculadorDeImpostos {
	
	public void realizarCalculo(Orcamento orcamento, Imposto impostoQualquer){
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}

}
