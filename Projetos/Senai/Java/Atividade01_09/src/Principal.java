import classes.Aluno;
import classes.DiarioDeClasse;
import classes.Situacao;

public class Principal {

	public static void main(String[] args) {
		
		Aluno objAluno = new Aluno();
		Aluno objAluno2 = new Aluno();
		Situacao objsituacao = new Situacao();
		Situacao objsituacao2 = new Situacao();
		objAluno.setCodigo();
		objAluno.setNome("Gabriel");
		objAluno2.setCodigo();
		objAluno2.setNome("Elyton");
		
		objsituacao.calcularMedia(objAluno, 5.0, 6.0, 6.0);
		objsituacao2.calcularMedia(objAluno2, 10.0, 9.0, 6.0);
		
		
		
		DiarioDeClasse objDiario = new DiarioDeClasse();
		objDiario.listagemAlunos();
		

	}

}
