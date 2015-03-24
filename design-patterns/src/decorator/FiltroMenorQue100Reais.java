package decorator;

import java.util.ArrayList;
import java.util.List;

import chainofresponsibility.Conta;


public class FiltroMenorQue100Reais extends Filtro {
	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMenorQue100Reais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (c.getSaldo() < 100)
				filtrada.add(c);
		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
