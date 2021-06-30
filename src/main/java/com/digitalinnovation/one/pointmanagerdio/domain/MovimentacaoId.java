package com.digitalinnovation.one.pointmanagerdio.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MovimentacaoId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idMovimento;
	private Long idUsuario;

	public Long getIdMovimento() {
		return idMovimento;
	}

	public void setIdMovimento(Long idMovimento) {
		this.idMovimento = idMovimento;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
