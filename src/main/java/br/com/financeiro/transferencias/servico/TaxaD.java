package br.com.financeiro.transferencias.servico;

import br.com.financeiro.transferencias.modelo.Agendamento;

import java.math.BigDecimal;

public class TaxaD implements Taxa {

	@Override
	public BigDecimal calculaValor(Agendamento agendamento) {
		BigDecimal valor = agendamento.getValor();
		BigDecimal VALOR_TETO_1 = new BigDecimal("25.000");
		BigDecimal VALOR_TETO_2 = new BigDecimal("120.000");

		if (valor.compareTo(VALOR_TETO_1) <= 0)
			return new TaxaA().calculaValor(agendamento);
		else if (valor.compareTo(VALOR_TETO_1) > 0 && valor.compareTo(VALOR_TETO_2) <= 0)
			return new TaxaB().calculaValor(agendamento);
		else
			return new TaxaC().calculaValor(agendamento);

	}

}
