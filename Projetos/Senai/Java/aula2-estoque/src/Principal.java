
public class Principal {

	public static void main(String[] args) {

		Estoque estoqueDeTubarao = new Estoque("Estoque de Tubarão",100);

		Estoque estoqueDeCriciuma = new Estoque(150);

		estoqueDeTubarao.transferirPara(estoqueDeCriciuma, 50);

		System.out.println(estoqueDeTubarao.getQuantidade());
		System.out.println(estoqueDeCriciuma.getQuantidade());

	}

}
