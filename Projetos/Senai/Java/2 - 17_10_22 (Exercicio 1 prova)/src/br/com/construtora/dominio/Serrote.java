package br.com.construtora.dominio;

public class Serrote extends Ferramenta {

	private int qtdDentes;
	private Cor Cor;

	public Serrote(int codigo, String descricao, double peso, int qtdDentes, Cor cor) {
		super(codigo, descricao, peso);

	}

	public int getQtdDentes() {
		return qtdDentes;
	}

	public void setQtdDentes(int qtdDentes) {
		this.qtdDentes = qtdDentes;
	}

	public Cor getCor() {
		return Cor;
	}

	public void setCor(Cor cor) {
		Cor = cor;
	}

}
