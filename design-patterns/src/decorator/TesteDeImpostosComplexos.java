package decorator;


import chainofresponsibility.Item;
import chainofresponsibility.Orcamento;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
        Imposto impostos = new ISS(new ICMS());        
        Imposto impMuitoAlto = new ImpostoMuitoAlto(new ICMS());
        Imposto impostoCondicional = new ICPP(new IKCV());
       

        Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.00));
		orcamento.adicionaItem(new Item("LAPIS", 250.00));

        System.out.println(impostos.calcula(orcamento));

        System.out.println(impMuitoAlto.calcula(orcamento));
        
        System.out.println(impostoCondicional.calcula(orcamento));

	}

}
