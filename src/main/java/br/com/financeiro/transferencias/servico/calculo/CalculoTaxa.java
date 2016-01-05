package br.com.financeiro.transferencias.servico.calculo;

import java.math.BigDecimal;
import br.com.financeiro.transferencias.modelo.Agendamento;

public interface CalculoTaxa {
	public BigDecimal calculandoValor(Agendamento agendamento);
}
