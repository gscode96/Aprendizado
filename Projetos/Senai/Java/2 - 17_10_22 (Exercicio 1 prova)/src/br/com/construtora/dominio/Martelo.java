package br.com.construtora.dominio;

public class Martelo extends Ferramenta {

	private TipoDeCabo tipoDeCabo;

	public Martelo(int codigo, String descricao, double peso, TipoDeCabo tipoCabo) {
		super(codigo, descricao, peso);
		
	}

	public TipoDeCabo getTipoDeCabo() {
		return tipoDeCabo;
	}

	public void setTipoDeCabo(TipoDeCabo tipoDeCabo) {
		this.tipoDeCabo = tipoDeCabo;
	}

	
}
