package chainofresponsibility;

public class TesteDeResposta {

	public static void main(String[] args) {
		Conta conta = new Conta("Mauro Gonçalves", 500.00);
		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		CorrenteDeResposta resp = new CorrenteDeResposta();
		
		resp.resposta(req, conta);

	}

}
