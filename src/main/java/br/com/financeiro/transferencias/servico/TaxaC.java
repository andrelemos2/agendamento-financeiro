package br.com.financeiro.transferencias.servico;

import br.com.financeiro.transferencias.modelo.Agendamento;

import java.math.BigDecimal;

public class TaxaC implements Taxa{

	@Override
	public BigDecimal calculaValor(Agendamento agendamento) {

		BigDecimal porcentagemAdicional = BigDecimal.ONE;
		
		
		if(agendamento.getIntervaloDias() > 30)
			porcentagemAdicional = new BigDecimal("1.2");
			else if (agendamento.getIntervaloDias() <= 30)
			porcentagemAdicional = new BigDecimal("2.1");
				else if (agendamento.getIntervaloDias() <= 25)
					porcentagemAdicional = new BigDecimal("4.3");
					else if (agendamento.getIntervaloDias() <= 20)
						porcentagemAdicional = new BigDecimal("5.4");
						else if (agendamento.getIntervaloDias() <= 15)
							porcentagemAdicional = new BigDecimal("6.7");
							else if (agendamento.getIntervaloDias() <= 10)
								porcentagemAdicional = new BigDecimal("7.4");
								else if (agendamento.getIntervaloDias() <= 5)
									porcentagemAdicional = new BigDecimal("8.3");
		
		return agendamento.getValor().add(porcentagemAdicional.divide(new BigDecimal("100")));
	}

}
