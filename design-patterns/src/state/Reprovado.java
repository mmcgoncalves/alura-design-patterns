package state;

public class Reprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException(
				"Orçamento está em estado de reprovação, não pode aprovar agora!");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Já estou reprovado!");
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
