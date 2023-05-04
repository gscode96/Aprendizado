package br.com.construtora.dominio;

import javax.swing.JOptionPane;

public abstract class Ferramenta {

	private int codigo;
	private String descricao;
	private double peso;

	public Ferramenta(int codigo, String descricao, double peso) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setPeso(peso);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao != null) {
			this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null, "A descricao nao pode ser vazia !");
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
