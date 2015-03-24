package chainofresponsibility;

public class CorrenteDeResposta {
	
	public void resposta(Requisicao req, Conta conta){
		Resposta csv = new RespostaEmCsv();
		Resposta porcento = new RespostaEmPorcento();
		Resposta xml = new RespostaEmXml();
		Resposta semResp = new SemResposta();
		
		csv.setProxima(porcento);		
		porcento.setProxima(xml);
		xml.setProxima(semResp);		
		
		csv.responde(req, conta);
	}

}
