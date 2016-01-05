package br.com.financeiro.transferencias.modelo;

import br.com.financeiro.transferencias.servico.calculo.TipoOperacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Agendamento {

	private String contaDe;
	private String contaPara;
	private LocalDate dataAgendamento;
	private BigDecimal valor;
	private TipoOperacao tipoOperacao;
	private String descricao;
	
	public Agendamento() {
	
	}

	public Agendamento(String contaDe, String contaPara, LocalDate dataAgendamento, BigDecimal valor,
			TipoOperacao tipoOperacao, String descricao) {
		super();
		this.contaDe = contaDe;
		this.contaPara = contaPara;
		this.dataAgendamento = dataAgendamento;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
		this.descricao = descricao;
	}

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

	public long getIntervaloDias() {
		long dias = ChronoUnit.DAYS.between(getDataCadastro(), getDataAgendamento());
		return dias;
	}

}
