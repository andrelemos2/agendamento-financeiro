package br.com.financeiro.transferencias.servico.calculo;

import br.com.financeiro.transferencias.servico.taxas.TaxaA;
import br.com.financeiro.transferencias.servico.taxas.TaxaB;
import br.com.financeiro.transferencias.servico.taxas.TaxaC;
import br.com.financeiro.transferencias.servico.taxas.TaxaD;

public enum TipoOperacao {
	A("Taxa A") {
		@Override
		public CalculoTaxa getTaxa() {
			return new TaxaA();
		}
	},
	B("Taxa B") {
		@Override
		public CalculoTaxa getTaxa() {
			return new TaxaB();
		}
	},
	C("Taxa C") {
		@Override
		public CalculoTaxa getTaxa() {
			return new TaxaC();
		}
	},
	D("Taxa D") {
		@Override
		public CalculoTaxa getTaxa() {
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

	public abstract CalculoTaxa getTaxa();
}
