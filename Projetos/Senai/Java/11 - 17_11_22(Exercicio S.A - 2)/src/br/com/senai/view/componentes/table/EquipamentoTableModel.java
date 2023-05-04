package br.com.senai.view.componentes.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.senai.core.domain.Equipamento;

public class EquipamentoTableModel extends AbstractTableModel {

	private final int QTDE_COLUNAS = 2;

	private List<Equipamento> equipamentos;

	public EquipamentoTableModel(List<Equipamento> equipamentos) {

		this.equipamentos = equipamentos;
	}

	@Override
	public int getRowCount() {
		return equipamentos.size();
	}

	@Override
	public int getColumnCount() {
		return QTDE_COLUNAS;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return equipamentos.get(rowIndex).getId();
			
		} else if (columnIndex == 1) {
			return equipamentos.get(rowIndex).getDescricaoCurta();
		}
		throw new IllegalArgumentException("índice inválido");
	}
	
	public Equipamento getPor(int rowIndex) {
		
		return equipamentos.get(rowIndex);
		
	}
	
	public void removerPor(int rowIndex) {
		this.equipamentos.remove(rowIndex);
		
	}
	
}
