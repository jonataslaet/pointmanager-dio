package com.digitalinnovation.one.pointmanagerdio.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Calendario {

	@Id
	private Long id;
	
	@OneToOne
	private TipoData tipoData;
	
	private String descricao;
	private LocalDateTime dataEspecial;

	public Calendario() {
	}

	public Calendario(Long id, TipoData tipoData, String descricao, LocalDateTime dataEspecial) {
		this.id = id;
		this.setTipoData(tipoData);
		this.descricao = descricao;
		this.setDataEspecial(dataEspecial);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoData getTipoData() {
		return tipoData;
	}

	public void setTipoData(TipoData tipoData) {
		this.tipoData = tipoData;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataEspecial() {
		return dataEspecial;
	}

	public void setDataEspecial(LocalDateTime dataEspecial) {
		this.dataEspecial = dataEspecial;
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
		Calendario other = (Calendario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
