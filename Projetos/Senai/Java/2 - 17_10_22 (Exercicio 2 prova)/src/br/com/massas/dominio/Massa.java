package br.com.massas.dominio;

import br.com.massas.util.TipoMassa;

public abstract class Massa {

	private int codigo;
	private String descricaoCurta;
	private TipoMassa tipoMassa;

	public Massa(int codigo, String descricaoCurta, TipoMassa tipoMassa) {
		super();
		this.codigo = codigo;
		this.descricaoCurta = descricaoCurta;
		this.tipoMassa = tipoMassa;
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

	public TipoMassa getTipoMassa() {
		return tipoMassa;
	}

	public void setTipoMassa(TipoMassa tipoMassa) {
		this.tipoMassa = tipoMassa;
	}

}
