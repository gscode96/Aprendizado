package classes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class pecas {
	
	public static ArrayList<pecas> pecasEstoque = new ArrayList<>();
	private static Integer proximoId = 1;
	private Integer id;
	private String descricao;
	private Double valor;
	private String dataCompra;
	private String fornecedor;
	
	
	public pecas () {
		
		
	}
	
	public pecas(Integer id, String descricao, Double valor, String dataCompra, String fornecedor) {
		super();
		this.id = proximoId++;
		this.descricao = descricao;
		this.valor = valor;
		this.dataCompra = dataCompra;
		this.fornecedor = fornecedor;
	}

	public static ArrayList<pecas> getPecasEstoque() {
		return pecasEstoque;
	}
	
	public static Integer getProximoId() {
		return proximoId++;
	}
	
	public static void setProximoId(Integer proximoId) {
		pecas.proximoId = proximoId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public static void setPecasEstoque(ArrayList<pecas> pecasEstoque) {
		pecas.pecasEstoque = pecasEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	@Override
	public String toString() {
		return "pecas\n" 
					+ "Id" + id 
					+ "\ndescricao: " + descricao 
					+  "\nvalor: " + valor 
					+ "\ndataCompra: " + dataCompra 
					+ "\nfornecedor: "+ fornecedor;
	}

	public pecas cadastrarPeca () {
		
		String txtTela = "Cadastro de Peça\n\n";
		this.descricao = JOptionPane.showInputDialog(txtTela + "Descrição da peça:");
		this.valor = Double.parseDouble(JOptionPane.showInputDialog(txtTela + "Valor da peça:"));
		this.dataCompra = JOptionPane.showInputDialog(txtTela + "Data da aquisição:");
		this.fornecedor = JOptionPane.showInputDialog(txtTela + "Fornecedor");
		this.setId(getProximoId());
		pecasEstoque.add(this);
		System.out.println(pecasEstoque);
		
		return this;
	}
	
	public String listarPorFornecedor (ArrayList<pecas> pecasEstoque) {
		
		String listarFornecedor = "";
		for (int i = 0; i < pecasEstoque.size(); i++) {
			listarFornecedor += "\n" + pecasEstoque.get(i).descricao + " - " + pecasEstoque.get(i).fornecedor;
			
		}
		
		JOptionPane.showMessageDialog(null, listarFornecedor);
		return "listarFornecedor";

	}
	
	
	
	
}
