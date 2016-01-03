package br.com.financeiro.transferencias.servico.taxa;

import br.com.financeiro.transferencias.modelo.Agendamento;
import br.com.financeiro.transferencias.servico.calculo.Taxa;

import java.math.BigDecimal;
/*
Operacoes do tipo D tem a taxa igual a A, B ou C dependendo do valor da transferência.
            Valores ate 25.000 seguem a taxacao tipo A.
            Valores de 25.001 ate 120.000 seguem a taxacao tipo B.
            Valores maiores que 120.000 seguem a taxacao tipo C.
 */
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
