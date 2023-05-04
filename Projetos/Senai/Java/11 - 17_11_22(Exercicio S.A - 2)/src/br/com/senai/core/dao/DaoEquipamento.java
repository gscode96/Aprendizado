package br.com.senai.core.dao;

import java.util.List;

import br.com.senai.core.domain.Equipamento;

public interface DaoEquipamento {
	
	
	public void Inserir(Equipamento equipamento);
	
	public void Alterar(Equipamento equipamento);
	
	public void ExcluirPor(int id);
	
	public Equipamento buscarPor(int id);
	
	public List<Equipamento> listarPor(String descricaoCurta); 
}
