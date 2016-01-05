package br.com.financeiro.transferencias.builder;

import br.com.financeiro.transferencias.modelo.Agendamento;

public class AgendamentoBuilderValido {

	private Agendamento instancia;

	public AgendamentoBuilderValido(Agendamento instancia) {
		this.instancia = instancia;
	}

	public Agendamento construir() {
		return this.instancia;
	}
}
