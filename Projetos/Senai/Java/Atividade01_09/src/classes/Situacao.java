package classes;

public class Situacao {

	private Aluno[] alunos = new Aluno[30];
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	private char situacao;

	public Situacao() {

	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public char getSituacao() {
		return situacao;
	}

	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}

	public double calcularMedia(Aluno aluno, double nota1, double nota2, double nota3) {
		media = 0;
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7) {
			aluno.setSituacaoFinal('A');
			
		} else {aluno.setSituacaoFinal('R');}

		return media;
	}

	
	
}
