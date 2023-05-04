package br.com.construtora;

import br.com.construtora.dominio.Cor;
import br.com.construtora.dominio.Martelo;
import br.com.construtora.dominio.Pedreiro;
import br.com.construtora.dominio.Serrote;
import br.com.construtora.dominio.TipoDeCabo;

public class Principal {

	public static void main(String[] args) {
		
		Pedreiro pedreiro = new Pedreiro();
		pedreiro.setCodigo(1);
		pedreiro.setNomeCompleto("Elyton Pereira");
		
		
		Serrote serrote = new Serrote(1, "Serrote Cinza", 1.5, 30, Cor.CINZA);
		
		Martelo martelo = new Martelo(2, "Martelo top", 2.0, TipoDeCabo.FIBRA);
		
		pedreiro.usar(martelo);
		pedreiro.usar(serrote);
		
		
	}

}
