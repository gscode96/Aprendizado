package br.com.softhouse.dominio;

public class Php extends Linguagem {
	
	private double versaoApache;

	public Php(int codigo, String descricaoCurta, String empresa, double versaoApache) {
		super(codigo, descricaoCurta, empresa);
		this.setVersaoApache(versaoApache);
	}

	public double getVersaoApache() {
		return versaoApache;
	}

	public void setVersaoApache(double versaoApache) {
		this.versaoApache = versaoApache;
	}
	
	
	
}
