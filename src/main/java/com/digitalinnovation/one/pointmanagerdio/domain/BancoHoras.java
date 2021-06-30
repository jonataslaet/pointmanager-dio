package com.digitalinnovation.one.pointmanagerdio.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BancoHoras {

	@Id
	@EmbeddedId
	private BancoHorasId id;

	private LocalDateTime dataTrabalhada;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldoHoras;

	public BancoHoras() {
	}

	public BancoHoras(BancoHorasId id, LocalDateTime dataTrabalhada, BigDecimal quantidadeHoras,
			BigDecimal saldoHoras) {
		this.id = id;
		this.dataTrabalhada = dataTrabalhada;
		this.quantidadeHoras = quantidadeHoras;
		this.saldoHoras = saldoHoras;
	}

	public BancoHorasId getId() {
		return id;
	}

	public void setId(BancoHorasId id) {
		this.id = id;
	}

	public LocalDateTime getDataTrabalhada() {
		return dataTrabalhada;
	}

	public void setDataTrabalhada(LocalDateTime dataTrabalhada) {
		this.dataTrabalhada = dataTrabalhada;
	}

	public BigDecimal getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(BigDecimal quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public BigDecimal getSaldoHoras() {
		return saldoHoras;
	}

	public void setSaldoHoras(BigDecimal saldoHoras) {
		this.saldoHoras = saldoHoras;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BancoHoras other = (BancoHoras) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
