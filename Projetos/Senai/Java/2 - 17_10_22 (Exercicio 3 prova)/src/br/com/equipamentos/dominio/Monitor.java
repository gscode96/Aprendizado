package br.com.equipamentos.dominio;

import br.com.equipamentos.util.Cor;
import br.com.equipamentos.util.Voltagem;

public class Monitor extends Equipamento {

	private int polegadas;
	private Cor cor;
	private double peso;

	public Monitor(int codigo, String descricaoCurta, String fabricante, String modelo, Voltagem voltagem,
			int polegadas, Cor cor, double peso) {
		super(codigo, descricaoCurta, fabricante, modelo, voltagem);
		this.setPolegadas(polegadas);
		this.setCor(cor);
		this.setPeso(peso);
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
