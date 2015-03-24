package state;

public class Finalizado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
	}
}
