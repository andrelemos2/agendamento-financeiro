package br.com.financeiro.transferencias.dao;

import br.com.financeiro.transferencias.modelo.Agendamento;

import java.util.List;

public class AgendamentoFacade {
	
	private AgendamentoDao dao = new AgendamentoDao();
	
	public void adicionar(Agendamento agendamento) {
		dao.adicionar(agendamento);
	}
	
	public List<Agendamento> buscar() {
		List<Agendamento> agendamentos = dao.buscar();
		return agendamentos;
	}

    
}
