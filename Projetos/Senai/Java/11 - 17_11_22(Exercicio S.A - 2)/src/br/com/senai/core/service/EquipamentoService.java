package br.com.senai.core.service;

import java.util.List;

import br.com.senai.core.dao.DaoEquipamento;
import br.com.senai.core.dao.FactoryDao;
import br.com.senai.core.domain.Equipamento;
import br.com.senai.core.domain.Status;

public class EquipamentoService {

	private DaoEquipamento dao;

	public EquipamentoService() {
		this.dao = FactoryDao.getInstance().getDaoEquipamento();

	}

	public void salvar(Equipamento equipamento) {

		this.validar(equipamento);
		boolean isPersistido = equipamento.getId() > 0;
		if (isPersistido) {
			this.dao.Alterar(equipamento);

		} else {
			this.dao.Inserir(equipamento);
		}

	}

	private void validar(Equipamento equipamento) {

		if (equipamento != null) {

			boolean isDescricaoInvalida = equipamento.getDescricaoCurta() == null
					|| equipamento.getDescricaoCurta().isBlank() || equipamento.getDescricaoCurta().length() < 3
					|| equipamento.getDescricaoCurta().length() > 150;

			if (isDescricaoInvalida) {
				throw new IllegalArgumentException("A descricao é obrigatoria e deve possuir entre 3 e 150 caracteres");

			}

			boolean isGarantiaInvalida = equipamento.getGarantia() < 1;

			if (isGarantiaInvalida) {
				throw new IllegalArgumentException("A garantia não pode ser um valor menor que zero");

			}

			boolean isStatusInvalido = equipamento.getStatus() == null;

			if (isStatusInvalido) {
				throw new NullPointerException("O status é obrigatório");
			}

			boolean isPersistido = equipamento.getId() > 0;
			if (isPersistido) {
				Equipamento equipamentoSalvo = dao.buscarPor(equipamento.getId());
				boolean isAlteracaoInvalida = equipamento.getStatus() != Status.E
						&& equipamentoSalvo.getStatus() == Status.E;

				if (isAlteracaoInvalida) {

					throw new IllegalArgumentException(
							"O equipamento já foi entregue não permitido a alteração do status dele");
				}
			}

		} else {

			throw new NullPointerException("O equipamento não pode ser nulo");

		}

	}

	public void removerPor(int idDoEquipamento) {

		if (idDoEquipamento > 0) {

			this.dao.ExcluirPor(idDoEquipamento);

		} else {
			throw new IllegalArgumentException("O id para remocao do equipamento deve ser maior que zero.");

		}

	}

	public List<Equipamento> listarPor(String descricao) {

		if (descricao != null && !descricao.isBlank()) {

			String filtro = descricao + "%";
			return dao.listarPor(filtro);

		} else {
			throw new IllegalArgumentException(" A descricao é obrigatoria ");

		}

	}

}
