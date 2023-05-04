package classes;

public class DiarioDeClasse {

	private int codigoDiario;
	private String nomeUnidade;
	Aluno[] alunos = new Aluno[30];

	public void listagemAlunos() {

		for (Aluno aluno : alunos) {
			if (aluno != null) {
				String listaAlunos = aluno.toString();

				System.out.println(listaAlunos);
			}
		}

	}
}
