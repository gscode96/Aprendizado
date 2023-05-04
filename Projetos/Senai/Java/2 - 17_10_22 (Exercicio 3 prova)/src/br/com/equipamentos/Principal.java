package br.com.equipamentos;

import br.com.equipamentos.dominio.Monitor;
import br.com.equipamentos.dominio.Notebook;
import br.com.equipamentos.dominio.Tecnico;
import br.com.equipamentos.util.Cor;
import br.com.equipamentos.util.Voltagem;

public class Principal {

	public static void main(String[] args) {
		
		Tecnico tecnico = new Tecnico(1, "Elyton");
		
		Monitor monitor = new Monitor(1, "Monitor top", "AOC", "Sniper v10", Voltagem.VOLTAGEM220, 22, Cor.PRETO, 2.50);
		
		Notebook notebook = new Notebook(2, "Notebook top", "Dell", "Dell ultrafoda", Voltagem.VOLTAGEM110, "Intel core I5", 8.0, 1000.00);
		
		tecnico.reparar(monitor);
		tecnico.reparar(notebook);
		

	}

}
