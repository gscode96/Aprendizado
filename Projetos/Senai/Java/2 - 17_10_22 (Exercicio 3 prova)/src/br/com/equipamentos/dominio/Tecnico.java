package br.com.equipamentos.dominio;

public class Tecnico {

	private int codigo;
	private String nomeCompleto;

	public Tecnico(int codigo, String nomeCompleto) {
		super();
		this.setCodigo(codigo);
		this.setNomeCompleto(nomeCompleto);
	}

	public void reparar(Equipamento equipamento) {
		System.out.println("Equipamento sendo reparado: " + equipamento.getDescricaoCurta());

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

}
