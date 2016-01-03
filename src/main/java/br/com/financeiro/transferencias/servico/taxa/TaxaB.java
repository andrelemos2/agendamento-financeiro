package br.com.financeiro.transferencias.servico.taxa;

import br.com.financeiro.transferencias.modelo.Agendamento;
import br.com.financeiro.transferencias.servico.calculo.Taxa;

import java.math.BigDecimal;

/*
Operacoes do tipo B tem uma taxa de valor
            10 para pedidos com agendamento ate 30 dias da data de cadastro
            8 para os demais
 */
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
