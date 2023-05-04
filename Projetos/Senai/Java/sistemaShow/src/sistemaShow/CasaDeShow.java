package sistemaShow;

public class CasaDeShow {

	boolean isEntradaLiberadaPara(Baladeiro baladeiro) {	
		
		boolean isMaiorDeIdade = baladeiro.idade >= 18;
		boolean isDocumentoApresentado = baladeiro.documento != null;
		
		
		return  isMaiorDeIdade && isDocumentoApresentado;	
		
	}
	
}
