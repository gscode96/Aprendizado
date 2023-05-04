package classes;

import javax.swing.JOptionPane;
import classes.pessoa;

public class menuPrincipal {
	
	public static void menuPrincipal() {
		
		Integer menu = 0;
		
		do {
			
			pessoa objpessoa = new pessoa();
		
		
		menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar participante"));
		
		if (menu == 1) {
			objpessoa.cadastro();
			
			
		}
		
		} while (menu != 0);
		
		
	}
	
}
