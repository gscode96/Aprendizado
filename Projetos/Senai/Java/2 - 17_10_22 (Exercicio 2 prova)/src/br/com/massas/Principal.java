package br.com.massas;

import br.com.massas.dominio.Cozinheiro;
import br.com.massas.dominio.Espaguete;
import br.com.massas.dominio.Penne;
import br.com.massas.util.Granularidade;
import br.com.massas.util.TipoMassa;

public class Principal {

	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro(1, "Rodrigo Maia");
		
		Espaguete espaguete = new Espaguete(1, "Espaguete top", TipoMassa.TRIGO, 10);
		Penne penne = new Penne(2, "Penne top", TipoMassa.INTEGRAL, Granularidade.FINA);
		
		cozinheiro.cozinhar(espaguete);
		cozinheiro.cozinhar(penne);
	}

}
