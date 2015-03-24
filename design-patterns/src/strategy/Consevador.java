package strategy;

public class Consevador implements Investimento {
	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
