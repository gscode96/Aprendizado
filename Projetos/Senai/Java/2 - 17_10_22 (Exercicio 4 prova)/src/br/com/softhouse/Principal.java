package br.com.softhouse;

import br.com.softhouse.dominio.Java;
import br.com.softhouse.dominio.Php;
import br.com.softhouse.dominio.Programador;

public class Principal {

	public static void main(String[] args) {
		
		Programador programador = new Programador(1, "Gabriel");
		
		Php php = new Php(1, "Linguagem PHP", "Microsoft", 2.0 );
		
		Java java = new Java (2, "Linguagem Java", "Sun", 17.8);
		
		programador.desenvolver(php);
		programador.desenvolver(java);
		

	}

}
