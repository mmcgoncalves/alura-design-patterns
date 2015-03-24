package templatemethod;

import java.util.ArrayList;
import java.util.List;

import chainofresponsibility.Conta;

public class TesteRelatorio {
	public static void main(String[] args) {
		Relatorio simples = new RelatorioSimples();
		Relatorio complexo = new RelatorioComplexo();
		
		Conta conta = new Conta("Mauro", 1500.0);
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(conta);
		contas.add(conta);
		
		simples.imprime(contas);
		System.out.println("------------------------------");
		complexo.imprime(contas); 
		
		
	}
}
