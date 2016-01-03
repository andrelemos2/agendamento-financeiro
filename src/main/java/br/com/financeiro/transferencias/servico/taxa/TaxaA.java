package br.com.financeiro.transferencias.servico.taxa;

import br.com.financeiro.transferencias.modelo.Agendamento;
import br.com.financeiro.transferencias.servico.calculo.Taxa;

import java.math.BigDecimal;

/*
Operacoes do tipo A tem uma taxa de valor 2 mais 3 porcento do valor da transferencia
 */
public class TaxaA implements Taxa {

	@Override
	public BigDecimal calculaValor(Agendamento agendamento) {
		BigDecimal taxaAdicional = new BigDecimal("2");
		BigDecimal porcentagemAdicional = new BigDecimal("3").divide(new BigDecimal("100"));
		BigDecimal taxaFinal = (agendamento.getValor().add(taxaAdicional)).multiply(porcentagemAdicional);
		return agendamento.getValor().add(taxaFinal) ;
	}

}
