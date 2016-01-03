package br.com.financeiro.transferencias.controle;

import br.com.financeiro.transferencias.dao.AgendamentoFacade;
import br.com.financeiro.transferencias.modelo.Agendamento;
import br.com.financeiro.transferencias.servico.calculo.Taxa;
import br.com.financeiro.transferencias.servico.calculo.TipoOperacao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@ManagedBean
@SessionScoped
public class AgendamentoMB implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4691750034939360870L;

    private Agendamento agendamento;
    private List<Agendamento> agendamentos;

    private AgendamentoFacade dao;

    public AgendamentoFacade getAgendamentoImpl() {
        if (dao == null) {
            dao = new AgendamentoFacade();
        }
        return dao;
    }

    public Agendamento getAgendamento() {
        if (agendamento == null) {
            agendamento = new Agendamento();
        }
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public String listarAgendamentos() {
        try {
            TipoOperacao tipoOperacao = agendamento.getTipoOperacao();
            Taxa taxa = tipoOperacao.getTaxa();
            BigDecimal valor = taxa.calculaValor(agendamento);
            agendamento.setValor(valor);
            getAgendamentoImpl().adicionar(agendamento);
            carregarAgendantos();
            apagarAgendamento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "agendamentos.xhtml";
    }

    public List<Agendamento> getTodosAgendamentos() {
        if (agendamentos == null) {
            carregarAgendantos();
        }
        return agendamentos;
    }

    private void carregarAgendantos() {
        agendamentos = getAgendamentoImpl().buscar();
    }

    public void apagarAgendamento() {
        agendamento = new Agendamento();
    }

    public TipoOperacao[] getTipoOperacaoValues() {
        return TipoOperacao.values();
    }

}
