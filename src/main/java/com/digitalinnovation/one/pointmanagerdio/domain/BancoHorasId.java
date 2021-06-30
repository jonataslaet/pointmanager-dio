package com.digitalinnovation.one.pointmanagerdio.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BancoHorasId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idBancoHoras;
	private Long idMovimentacao;
	private Long idUsuario;

	public Long getIdBancoHoras() {
		return idBancoHoras;
	}

	public void setIdBancoHoras(Long idBancoHoras) {
		this.idBancoHoras = idBancoHoras;
	}

	public Long getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(Long idMovimento) {
		this.idMovimentacao = idMovimento;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
