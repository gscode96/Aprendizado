package br.com.massas.dominio;

public class Cozinheiro {

	private int codigo;
	private String nomeCompleto;

	public Cozinheiro(int codigo, String nomeCompleto) {
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
	
	public void cozinhar(Massa massa) {
		System.out.println("Massa sendo preparada: " + massa.getDescricaoCurta());
		
		
	}
	
	

}
