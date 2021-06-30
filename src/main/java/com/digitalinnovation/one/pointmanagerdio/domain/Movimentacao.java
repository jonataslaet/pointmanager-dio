package com.digitalinnovation.one.pointmanagerdio.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Movimentacao {

	@Id
	@EmbeddedId
	private MovimentacaoId id;

	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private BigDecimal periodo;
	
	@OneToOne
	private Ocorrencia ocorrencia;
	
	@OneToOne
	private Calendario calendario;

	public Movimentacao() {
	}

	
	public Movimentacao(MovimentacaoId id, LocalDateTime dataEntrada, LocalDateTime dataSaida, BigDecimal periodo,
			Ocorrencia ocorrencia, Calendario calendario) {
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.periodo = periodo;
		this.ocorrencia = ocorrencia;
		this.calendario = calendario;
	}


	public MovimentacaoId getId() {
		return id;
	}

	public void setId(MovimentacaoId id) {
		this.id = id;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDateTime dataSaida) {
		this.dataSaida = dataSaida;
	}

	public BigDecimal getPeriodo() {
		return periodo;
	}

	public void setPeriodo(BigDecimal periodo) {
		this.periodo = periodo;
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Calendario getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}

}
