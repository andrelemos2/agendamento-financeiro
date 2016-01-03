package br.com.financeiro.transferencias.dao;

import br.com.financeiro.transferencias.modelo.Agendamento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreasl on 02/01/16.
 */
public class AgendamentoDao {
    private List<Agendamento> agendamentos = new ArrayList<Agendamento>();
    
    public void adicionar(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    
    public List<Agendamento> buscar() {
        return agendamentos;
    }
}
