package sistemaShow;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Baladeiro baladeiro = new Baladeiro();
		
		baladeiro.nome = "Luva de pedreiro";
		baladeiro.idade = 25;
		baladeiro.documento = "0058.00278-10";
		
		Baladeiro baladeira = new Baladeiro();
		
		
		baladeira.nome = "Mikasa";
		baladeira.idade = 18;
		baladeira.documento = "006.900.289.10";
		
		
		CasaDeShow hangar = new CasaDeShow();
		
		boolean isLiberado = hangar.isEntradaLiberadaPara(baladeiro);
		
		if (isLiberado) {
			
			JOptionPane.showMessageDialog(null, baladeiro.nome + " esta liberado!");
		} else {
			
			JOptionPane.showMessageDialog(null, baladeiro.nome + " não pode entrar!");
		}
		
		
		baladeiro.flertar(baladeira);
		System.out.println("Baladeiro: " + baladeiro.nome);
		System.out.println("Baladeiro liberado? " + isLiberado);
	}

}
