package sistemaShow;

public class Baladeiro {

	String nome;
	Integer idade;
	String documento;

	
	
	void flertar (Baladeiro outro) {
		
		System.out.println("Olá Pitanguinha! Meu nome é " 
					+ this.nome 
					+ " ,qual a sua graça?");
		System.out.println("Olá tudo bem ? Me chamo " + outro.nome);
	}
	
}
