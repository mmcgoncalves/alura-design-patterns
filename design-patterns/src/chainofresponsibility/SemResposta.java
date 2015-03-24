package chainofresponsibility;

public class SemResposta implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {
		// Não tem!

	}

	@Override
	public void setProxima(Resposta resposta) {
		// Não tem!

	}

}
