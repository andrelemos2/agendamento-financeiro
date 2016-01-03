package br.com.financeiro.transferencias.modelo;

import br.com.financeiro.transferencias.servico.calculo.TipoOperacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Agendamento {

	private String contaDe;
	private String contaPara;
	private LocalDate dataAgendamento;
	private BigDecimal valor;
	private TipoOperacao tipoOperacao;
	private String descricao;

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public int getIntervaloDias() {
		Period intervalo = Period.between(getDataAgendamento(), getDataCadastro());

		return intervalo.getDays();
	}

}
