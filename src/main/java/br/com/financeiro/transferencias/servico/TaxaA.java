package br.com.financeiro.transferencias.servico;

import java.math.BigDecimal;

import br.com.financeiro.transferencias.modelo.Agendamento;

public class TaxaA implements Taxa{

	@Override
	public BigDecimal calculaValor(Agendamento agendamento) {
		BigDecimal taxaAdicional = new BigDecimal("2");
		BigDecimal porcentagemAdicional = new BigDecimal("3").divide(new BigDecimal("100"));
		BigDecimal taxaFinal = (agendamento.getValor().add(taxaAdicional)).multiply(porcentagemAdicional);
		return agendamento.getValor().add(taxaFinal) ;
	}

}
