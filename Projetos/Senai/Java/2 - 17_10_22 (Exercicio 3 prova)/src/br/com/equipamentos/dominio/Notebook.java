package br.com.equipamentos.dominio;

import br.com.equipamentos.util.Voltagem;

public class Notebook extends Equipamento {

	private String processador;
	private double memoriaRam;
	private double discoRigido;

	public Notebook(int codigo, String descricaoCurta, String fabricante, String modelo, Voltagem voltagem,
			String processador, double memoriaRam, double discoRigido) {
		super(codigo, descricaoCurta, fabricante, modelo, voltagem);
		this.setProcessador(processador);
		this.setMemoriaRam(memoriaRam);
		this.setDiscoRigido(discoRigido);
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public double getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(double memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public double getDiscoRigido() {
		return discoRigido;
	}

	public void setDiscoRigido(double discoRigido) {
		this.discoRigido = discoRigido;
	}
	
	

}
