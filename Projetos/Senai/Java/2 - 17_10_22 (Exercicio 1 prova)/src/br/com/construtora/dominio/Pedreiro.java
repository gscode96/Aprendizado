package br.com.construtora.dominio;

public class Pedreiro {

	private int codigo;
	private String nomeCompleto;

	public Pedreiro() {

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
	
	public void usar(Ferramenta ferramenta) {
		System.out.println("Ferramenta sendo utilizada: " + ferramenta.getDescricao());
	}

}
