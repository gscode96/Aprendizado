package classes;

import classes.pecas;
import javax.swing.JOptionPane;

public class menuPrincipal {

	public static void execMenu() {

		int menu;
		pecas objpecas = new pecas();

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n" + "1 - Cadastrar Peça\n"
					+ "2 - Listar Fornecedor\n" + "3 - Relatorio\n" + "4 - Sair"));

			switch (menu) {

			case 1:
				objpecas.cadastrarPeca();
				break;

			case 2:
				objpecas.listarPorFornecedor();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Chegou");
				break;

			case 4:

				break;

			default:
				break;
			}

		} while (menu != 4);
	}

}
