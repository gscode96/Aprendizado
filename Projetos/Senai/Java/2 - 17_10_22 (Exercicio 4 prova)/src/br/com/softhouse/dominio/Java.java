package br.com.softhouse.dominio;

public class Java extends Linguagem {

	private double versaoJDK;

	public Java(int codigo, String descricaoCurta, String empresa, double versaoJDK) {
		super(codigo, descricaoCurta, empresa);
		this.setVersaoJDK(versaoJDK);
	}

	public double getVersaoJDK() {
		return versaoJDK;
	}

	public void setVersaoJDK(double versaoJDK) {
		this.versaoJDK = versaoJDK;
	}

}
