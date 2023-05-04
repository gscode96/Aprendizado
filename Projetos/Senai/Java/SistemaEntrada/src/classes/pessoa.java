package classes;

import javax.swing.JOptionPane;
import classes.portaria;

public class pessoa {
	
	portaria objportaria = new portaria();

	String nome;
	Integer idade;
	Integer cpf;
	Boolean ingreso;
	Boolean comprovante;
	
	
	public pessoa () {
		
		
	}
	
	
	public pessoa(String nome, Integer idade, Integer cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public Integer getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	} 
	
	
	public void cadastro() {
		
		this.nome = JOptionPane.showInputDialog("Nome: ");
		this.idade = Integer.parseInt(JOptionPane.showInputDialog("idade: "));
		this.cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF: "));
		this.ingreso = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Possui ingresso? "));
		this.comprovante = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Possui comprovante? "));
		objportaria.validacao();
		
		
	}
	
	
	
	
}
