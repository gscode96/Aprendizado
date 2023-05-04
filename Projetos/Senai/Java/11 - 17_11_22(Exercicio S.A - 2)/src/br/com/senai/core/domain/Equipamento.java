package br.com.senai.core.domain;

import java.util.Objects;

public class Equipamento {

	private int id;
	private String descricaoCurta;
	private String especificações;
	private int garantia;
	private Status status;

	public Equipamento(String descricaoCurta, String especificações, int garantia) {

		this.descricaoCurta = descricaoCurta;
		this.especificações = especificações;
		this.garantia = garantia;
		this.status = Status.R;
	}

	public Equipamento(int id, String descricaoCurta, String especificações, int garantia, Status status) {

		this(descricaoCurta, especificações, garantia);
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getEspecificações() {
		return especificações;
	}

	public void setEspecificações(String especificações) {
		this.especificações = especificações;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamento other = (Equipamento) obj;
		return id == other.id;
	}

	
	
	
}
