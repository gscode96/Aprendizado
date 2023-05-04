package classes;

import javax.swing.JOptionPane;

import classes.pessoa;

public class portaria {

	public static void validacao () {
		
		pessoa objpessoa = new pessoa();
		Boolean validacao = false;
		
		
		if(objpessoa.ingreso == false || objpessoa.comprovante == false) {
			JOptionPane.showMessageDialog(null, "Usuario não pode passar ! Falta comprovante ou ingreso!");
			validacao = false;
				
		} else {validacao = true;}
		
		
	}
	
	
}
