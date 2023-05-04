package br.com.equipamentos.dominio;

import br.com.equipamentos.util.Voltagem;

public abstract class Equipamento {

	private int codigo;
	private String descricaoCurta;
	private String fabricante;
	private String modelo;
	private Voltagem voltagem;

	public Equipamento(int codigo, String descricaoCurta, String fabricante, String modelo, Voltagem voltagem) {
		super();
		this.setCodigo(codigo);
		this.setDescricaoCurta(descricaoCurta);
		this.setFabricante(fabricante);
		this.setModelo(modelo);
		this.setVoltagem(voltagem);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Voltagem getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(Voltagem voltagem) {
		this.voltagem = voltagem;
	}

}
