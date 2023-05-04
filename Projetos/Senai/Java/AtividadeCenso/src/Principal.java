import classes.Censo;
import classes.Pessoa;
import classes.ResumoDeIdades;

public class Principal {

	public static void main(String[] args) {
		
		Censo censo = new Censo();
		
		Pessoa gabriel = new Pessoa();
		
		gabriel.setSexo('M');
		gabriel.setIsEmpregrado(true);
		gabriel.setRenda(1200.00);
		gabriel.setIdade(26);
		
		censo.registrar(gabriel);
		
		Pessoa elyton = new Pessoa();
		
		elyton.setSexo('F');
		elyton.setIsEmpregrado(false);
		elyton.setIdade(20);
		
		censo.registrar(elyton);
		
		Pessoa antonieta = new Pessoa();
		
		antonieta.setSexo('F');
		antonieta.setIsEmpregrado(false);
		antonieta.setRenda(920.00);
		antonieta.setIdade(69);
		
		censo.registrar(antonieta);
		
		Pessoa enzo = new Pessoa();
		
		enzo.setSexo('M');
		enzo.setIsEmpregrado(false);
		enzo.setIdade(2);
		
		censo.registrar(enzo);
		
		System.out.println("Qtde de homens " + censo.contarHomens());
		System.out.println("Qtde de mulheres " + censo.contarMulheres());
		System.out.println("Renda media " + censo.calcularRendaMedia());
		ResumoDeIdades resumo = censo.gerarResumoDeIdade();
		System.out.println("Criancas " + resumo.getQtdeDeCriancas());
		System.out.println("Jovens " + resumo.getQtdeDeJovens());
		System.out.println("Adultos " + resumo.getQtdeDeAdultos());
		System.out.println("Idosos " + resumo.getQtdeDeIdosos());
		
		
		
	}

}
