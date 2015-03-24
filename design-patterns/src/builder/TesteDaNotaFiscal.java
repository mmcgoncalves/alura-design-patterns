package builder;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum Inovação").comCnpj("99999/9999")
				.comItem(new ItemDaNota("Item1", 200))
				.comItem(new ItemDaNota("Item2", 300))
				.comItem(new ItemDaNota("Item3", 400)).comObservacoes("obs");
		

		NotaFiscal nf = builder.constroi();

		System.out.println(nf.getValorBruto());
		System.out.println(nf.getDataDeEmissao().getTime());

		// Com bulider ItemDaNotaFiscal

		ItemDaNotaBuilder iBuilder = new ItemDaNotaBuilder();
		iBuilder.comDescricao("Item 1").comValor(100);

		ItemDaNota item = iBuilder.constroi();

		builder.comItem(item);

		NotaFiscal nf2 = builder.constroi();

		System.out.println(nf2.getValorBruto());

	}

}
