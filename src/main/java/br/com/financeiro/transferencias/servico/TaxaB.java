package br.com.financeiro.transferencias.servico;

import br.com.financeiro.transferencias.modelo.Agendamento;

import java.math.BigDecimal;


public class TaxaB implements Taxa {

	@Override
	public BigDecimal calculaValor(Agendamento agendamento) {
		BigDecimal taxaAdicional = BigDecimal.ZERO;
		if (agendamento.getIntervaloDias() <= 30)
			taxaAdicional = BigDecimal.TEN;
		else
			taxaAdicional = new BigDecimal("8");

		return agendamento.getValor().add(taxaAdicional);
	}

}
