
public class RelatorioDeGastos {

	private FuncionarioAdministrativo[] funcionarios;
	private int indice;

	public RelatorioDeGastos() {
		this.funcionarios = new FuncionarioAdministrativo[10];

	}

	public void registrar(FuncionarioAdministrativo funcionario) {
		this.funcionarios[indice] = funcionario;
		indice++;

	}

	public void apresentar() {

		for (FuncionarioAdministrativo func : funcionarios) {
			if (func != null) {
				System.out.println(func.getInfo());
				System.out.println("Gasto: r$ " + func.getGasto());
				System.out.println("--------------------");

			}
		}

	}

}
