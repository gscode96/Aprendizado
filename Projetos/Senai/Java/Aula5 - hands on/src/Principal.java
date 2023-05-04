
public class Principal {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setNome("Ciro Gomes");
		professor.setSalario(1400);
		professor.setHorasAula(100);
		
		
		FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo();
		funcionario.setNome("Gabriel");
		funcionario.setSalario(2000);
		
		
		FuncionarioAdministrativo outroFuncionario = new FuncionarioAdministrativo();
		outroFuncionario.setNome("Boulos");
		outroFuncionario.setSalario(2500);
		
		RelatorioDeGastos relatorio = new RelatorioDeGastos();
		relatorio.registrar(professor);
		relatorio.registrar(funcionario);
		relatorio.registrar(outroFuncionario);
		
		relatorio.apresentar();
	}

}
