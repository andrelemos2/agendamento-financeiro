package br.com.financeiro.transferencias.controle;

import br.com.financeiro.transferencias.modelo.Agendamento;
import br.com.financeiro.transferencias.servico.Taxa;
import br.com.financeiro.transferencias.servico.TipoOperacao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class AgendamentoMB implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 4691750034939360870L;
	
	private Agendamento agendamento = new Agendamento();
	private List<Agendamento> agendamentos = new ArrayList<Agendamento>();

	public AgendamentoMB() {
	}
	
	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}
	
	public TipoOperacao[] getTipoOperacaoValues() {
	    return TipoOperacao.values();
	  }

	public void agendar() {
		TipoOperacao tipoOperacao = agendamento.getTipoOperacao();
		Taxa taxa = tipoOperacao.getTaxa();
		BigDecimal valor = taxa.calculaValor(agendamento);
		agendamento.setValor(valor);
		agendamentos.add(agendamento);
		agendamento = new Agendamento();
	}

}
