package br.com.softhouse.dominio;

public abstract class Linguagem {

	private int codigo;
	private String descricaoCurta;
	private String empresa;

	public Linguagem(int codigo, String descricaoCurta, String empresa) {
		super();
		this.setCodigo(codigo);
		this.setDescricaoCurta(descricaoCurta);
		this.setEmpresa(empresa);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
