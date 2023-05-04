package br.com.softhouse.dominio;

public class Programador {

	private int codigo;
	private String nomeCompleto;

	public Programador(int codigo, String nomeCompleto) {
		super();
		this.setCodigo(codigo);
		this.setNomeCompleto(nomeCompleto);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public void desenvolver(Linguagem linguagem) {
		System.out.println("Linguagem de programação utilizada: " + linguagem.getDescricaoCurta());
	}

}
