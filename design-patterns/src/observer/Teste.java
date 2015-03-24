package observer;

import builder.ItemDaNota;


public class Teste {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());
        builder.adicionaAcao(new Multiplicador(2));
        builder.adicionaAcao(new Multiplicador(3));
        builder.adicionaAcao(new Multiplicador(5.5));

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                          .comCnpj("123.456.789/0001-10")
                          .comItem(new ItemDaNota("item 1", 100.0))
                          .comItem(new ItemDaNota("item 2", 200.0))
                          .comItem(new ItemDaNota("item 3", 300.0))
                          .comObservacoes("entregar notaFiscal pessoalmente")
                          .constroi();
        
		System.out.println(notaFiscal.getValorBruto());
		//System.out.println(notaFiscal.getDataDeEmissao().getTime());
      

	}

}
