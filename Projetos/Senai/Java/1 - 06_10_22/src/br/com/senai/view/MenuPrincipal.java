package br.com.senai.view;

import javax.swing.JOptionPane;

import br.com.senai.dominio.Paciente;
import br.com.senai.dominio.Prontuario;
import br.com.senai.util.BaseDeDados;

public class MenuPrincipal {

	private BaseDeDados baseDeDados;

	public MenuPrincipal() {

		this.baseDeDados = new BaseDeDados();
	}

	public void Iniciar() {

		int opcaoSelecionada = 0;
		String textoDoMenu = "1 - Cadastrar Paciente\n" + "2 - Cadastrar Prontuário\n" + "3 - Listar Pacientes\n"
				+ "4 - Sair";
		
		
		opcaoSelecionada = Integer.parseInt(JOptionPane.showInputDialog(textoDoMenu));

		Paciente paciente = new Paciente(1, "Jose da silva", "123456789", "12345678910");
		this.baseDeDados.Registrar(paciente);

		paciente = new Paciente(2, "Maria mercedes", "123456789", "12345678910");

		this.baseDeDados.Registrar(paciente);

		do {

			try {
				

				switch (opcaoSelecionada) {
				case 1:
					this.cadastrarPaciente();
					break;

				case 2:
					this.cadastrarProntuario();
					break;
					
				case 3:
					this.listarPacientes();
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "A opção é invalida!");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());

			}

		} while (opcaoSelecionada != 4);

	}

	private void cadastrarPaciente() {

		int id = 0;

		do {

			try {
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do paciente: "));
			} catch (NumberFormatException nfe) {
				id = 0;
			}

		} while (id == 0);

		try {
			String nomeCompleto = JOptionPane.showInputDialog(null, "Digite o nome completo: ");
			String rg = JOptionPane.showInputDialog(null, "Digite o rg: ");
			String cpf = JOptionPane.showInputDialog(null, "Digite o cpf: ");
			Paciente novoPaciente = new Paciente(id, nomeCompleto, rg, cpf);
			this.baseDeDados.Registrar(novoPaciente);
			JOptionPane.showMessageDialog(null, "Paciente registrado com sucesso !");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	private Paciente selecionarPaciente() {
		Paciente[] pacientes = baseDeDados.listarRegistrados();
		String listagem = "";
		for (Paciente paciente : pacientes) {
			listagem += paciente + "\n";
		}
		Paciente paciente = null;
		try {
			int idInformado = Integer.parseInt(JOptionPane.showInputDialog(listagem));
			paciente = baseDeDados.buscarPor(idInformado);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, nfe.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return paciente;
	}

	private void cadastrarProntuario() {
		Paciente pacienteSelecionado = selecionarPaciente();
		try {
			if (pacienteSelecionado != null) {

				double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura: "));
				int pressaoSistolica = Integer.parseInt(JOptionPane.showInputDialog("Informe a pressao sistolica: "));
				int pressaoDiastolica = Integer.parseInt(JOptionPane.showInputDialog("Informe a pressao diastolica: "));
				Prontuario prontuario = new Prontuario(temperatura, pressaoSistolica, pressaoDiastolica);
				pacienteSelecionado.setProntuario(prontuario);
				JOptionPane.showMessageDialog(null, "Prontuario registrado com sucesso!");
			}
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, nfe.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
	private void listarPacientes() {
		Paciente[] pacientes = baseDeDados.listarRegistrados();
		String relatorio = "";
		for (Paciente paciente : pacientes) {
			relatorio += paciente;
		}
		JOptionPane.showMessageDialog(null, relatorio);
	}
}
