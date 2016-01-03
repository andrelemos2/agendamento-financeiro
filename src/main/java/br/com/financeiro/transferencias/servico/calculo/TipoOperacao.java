package br.com.financeiro.transferencias.servico.calculo;

import br.com.financeiro.transferencias.servico.taxa.TaxaA;
import br.com.financeiro.transferencias.servico.taxa.TaxaB;
import br.com.financeiro.transferencias.servico.taxa.TaxaC;
import br.com.financeiro.transferencias.servico.taxa.TaxaD;

public enum TipoOperacao {
	A("Taxa A") {
		@Override
		public Taxa getTaxa() {
			return new TaxaA();
		}
	},
	B("Taxa B") {
		@Override
		public Taxa getTaxa() {
			return new TaxaB();
		}
	},
	C("Taxa C") {
		@Override
		public Taxa getTaxa() {
			return new TaxaC();
		}
	},
	D("Taxa D") {
		@Override
		public Taxa getTaxa() {
			return new TaxaD();
		}
	};

	private final String nome;

	TipoOperacao(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public abstract Taxa getTaxa();
}
