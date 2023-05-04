package br.com.massas.dominio;

import br.com.massas.util.TipoMassa;

public class Espaguete extends Massa {
	
	private int numero;

	public Espaguete(int codigo, String descricaoCurta, TipoMassa tipoMassa, int numero) {
		super(codigo, descricaoCurta, tipoMassa);
		this.setCodigo(codigo);
		this.setDescricaoCurta(descricaoCurta);
		this.setTipoMassa(tipoMassa);
		this.setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
