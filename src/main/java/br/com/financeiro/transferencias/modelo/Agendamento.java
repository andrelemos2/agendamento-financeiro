package br.com.financeiro.transferencias.modelo;

import br.com.financeiro.transferencias.servico.TipoOperacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Agendamento {

	private String contaDe;
	private String contaPara;
	private LocalDate dataAgendamento;
	private LocalDate dataCadastro;
	private BigDecimal valor;
	private TipoOperacao tipoOperacao;

	

	public String getContaDe() {
		return contaDe;
	}

	public void setContaDe(String contaDe) {
		this.contaDe = contaDe;
	}

	public String getContaPara() {
		return contaPara;
	}

	public void setContaPara(String contaPara) {
		this.contaPara = contaPara;
	}

	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public LocalDate getDataCadastro() {
		return LocalDate.now();
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public int getIntervaloDias(){
		Period intervalo = Period.between(getDataAgendamento(), getDataCadastro());

		return intervalo.getDays();
	}

}
