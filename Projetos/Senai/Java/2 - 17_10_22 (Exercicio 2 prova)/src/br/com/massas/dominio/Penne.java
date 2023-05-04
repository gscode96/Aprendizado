package br.com.massas.dominio;

import br.com.massas.util.Granularidade;
import br.com.massas.util.TipoMassa;

public class Penne extends Massa {

	Granularidade granularidade;

	public Penne(int codigo, String descricaoCurta, TipoMassa tipoMassa, Granularidade granularidade) {
		super(codigo, descricaoCurta, tipoMassa);
		this.setGranularidade(granularidade);
	}

	public Granularidade getGranularidade() {
		return granularidade;
	}

	public void setGranularidade(Granularidade granularidade) {
		this.granularidade = granularidade;
	}
	
	
	
	
	
}
