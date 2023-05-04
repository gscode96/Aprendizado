package classes;

public class Aluno {
	Aluno[] alunos;
	private int proxCodigo = 1;
	private int codigo = 0;
	private String nome;
	private char situacaoFinal;

	public Aluno() {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo() {
		this.codigo = proxCodigo;
		proxCodigo++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSituacaoFinal() {
		return situacaoFinal;
	}

	public void setSituacaoFinal(char situacaoFinal) {
		this.situacaoFinal = situacaoFinal;
	}
	
	
	public void registrarAluno(Aluno aluno) {
		this.alunos[codigo] = aluno;
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Aluno [codigo=" + codigo + ", nome=" + nome + ", situacaoFinal=" + situacaoFinal + "]";
	}
	
	

}
