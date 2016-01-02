package br.com.financeiro.transferencias.servico;

public enum TipoOperacao {
	A("A") {
		@Override
		public Taxa getTaxa() {
			return new TaxaA();
		}
	},
	B("B") {
		@Override
		public Taxa getTaxa() {
			return new TaxaB();
		}
	},
	C("C") {
		@Override
		public Taxa getTaxa() {
			return new TaxaC();
		}
	},
	D("D") {
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
