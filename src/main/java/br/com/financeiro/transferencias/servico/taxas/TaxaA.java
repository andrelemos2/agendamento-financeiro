package br.com.financeiro.transferencias.servico.taxas;

import br.com.financeiro.transferencias.modelo.Agendamento;
import br.com.financeiro.transferencias.servico.calculo.CalculoTaxa;

import java.math.BigDecimal;

/*
Operacoes do tipo A tem uma taxa de valor 2 mais 3 porcento do valor da transferencia
 */
public class TaxaA  implements CalculoTaxa{
	
	private static final BigDecimal DIVIDE_100 = new BigDecimal("100");
	private static final BigDecimal VALOR_TAXA_ADICIONAL = new BigDecimal("2");
	private static final BigDecimal PORCENTAGEM_ADICIONAL = new BigDecimal("3").divide(DIVIDE_100);
	
	@Override
	public BigDecimal calculandoValor(Agendamento agendamento) {
		BigDecimal taxaFinal = agendamento.getValor().multiply(PORCENTAGEM_ADICIONAL).add(VALOR_TAXA_ADICIONAL);
		return agendamento.getValor().add(taxaFinal) ;
	}	

}