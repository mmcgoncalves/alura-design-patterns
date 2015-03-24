package decorator;

import chainofresponsibility.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	public TemplateDeImpostoCondicional() {
	}

	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

}
