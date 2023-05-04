package br.com.senai.core.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.core.dao.DaoEquipamento;
import br.com.senai.core.dao.ManagerDb;
import br.com.senai.core.domain.Equipamento;
import br.com.senai.core.domain.Status;

public class DaoPostgresqlEquipamento implements DaoEquipamento {

	private final String INSERT = "INSERT INTO equipamentos (descricao_curta, especificacoes, garantia, status) VALUES (?, ?, ?, ?)";

	private final String UPDATE = "UPDATE equipamentos SET descricao_curta = ?, especificacoes = ?, garantia = ?, status = ? WHERE id = ?";

	private final String DELETE = "DELETE FROM equipamentos WHERE id = ?";

	private final String SELECT_BY_ID = "SELECT id, descricao_curta, especificacoes, garantia, status FROM equipamentos WHERE id = ?";

	private final String SELECT_BY_DESC = "SELECT id, descricao_curta, especificacoes, garantia, status FROM equipamentos WHERE Upper(descricao_curta) LIKE Upper (?)";

	private Connection conexao;

	public DaoPostgresqlEquipamento() {
		this.conexao = ManagerDb.getInstance().getConexao();

	}

	@Override
	public void Inserir(Equipamento equipamento) {

		PreparedStatement ps = null;

		try {

			ps = conexao.prepareStatement(INSERT);
			ps.setString(1, equipamento.getDescricaoCurta());
			ps.setString(2, equipamento.getEspecificações());
			ps.setInt(3, equipamento.getGarantia());
			ps.setString(3, equipamento.getStatus().name());
			ps.execute();

		} catch (Exception ex) {

			throw new RuntimeException("Ocorreu um erro ao inserir o equipamento. Motivo: " + ex.getMessage());

		} finally {
			ManagerDb.getInstance().fechar(ps);
		}

	}

	@Override
	public void Alterar(Equipamento equipamento) {
		PreparedStatement ps = null;

		try {

			ManagerDb.getInstance().configurarAutocommitDa(conexao, false);
			ps = conexao.prepareStatement(UPDATE);
			ps.setString(1, equipamento.getDescricaoCurta());
			ps.setString(2, equipamento.getEspecificações());
			ps.setInt(3, equipamento.getGarantia());
			ps.setString(4, equipamento.getStatus().name());
			ps.setInt(5, equipamento.getId());

			boolean isAlteracaoOK = ps.executeUpdate() == 1;
			if (isAlteracaoOK) {
				conexao.commit();

			} else {
				conexao.rollback();

			}
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao alterar o equipamento. Motivo: " + e.getMessage());
		} finally {
			ManagerDb.getInstance().fechar(ps);
		}
	}

	@Override
	public void ExcluirPor(int id) {

		PreparedStatement ps = null;

		try {
			ps = conexao.prepareStatement(DELETE);
			ps.setInt(1, id);
			boolean isExclussaoOK = ps.executeUpdate() == 1;
			if (isExclussaoOK) {
				conexao.commit();
			} else {
				conexao.rollback();
			}

		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro na exclusão do equipamento. Motivo: " + e.getMessage());
		} finally {
			ManagerDb.getInstance().fechar(ps);
		}

	}

	@Override
	public Equipamento buscarPor(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conexao.prepareStatement(SELECT_BY_ID);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				return extrairDo(rs);

			} else {
				return null;

			}

		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro na busca do equipamento. Motivo: " + e.getMessage());
		} finally {
			ManagerDb.getInstance().fechar(ps);
			ManagerDb.getInstance().fechar(rs);
		}

	}

	@Override
	public List<Equipamento> listarPor(String descricaoCurta) {

		List<Equipamento> equipamento = new ArrayList<Equipamento>();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conexao.prepareStatement(SELECT_BY_DESC);
			ps.setString(1, descricaoCurta);
			rs = ps.executeQuery();

			while (rs.next()) {
				equipamento.add(extrairDo(rs));

			}
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao listar o equipamento. Motivo: " + e.getMessage());
		} finally {
			ManagerDb.getInstance().fechar(ps);
			ManagerDb.getInstance().fechar(rs);
			;
		}

		return equipamento;
	}

	private Equipamento extrairDo(ResultSet rs) {
		try {
			int id = rs.getInt("id");
			String descricaoCurta = rs.getString("descricao_curta");
			String especificacoes = rs.getString("especificacoes");
			int garantia = rs.getInt("garantia");
			Status status = Status.valueOf(rs.getString("status"));
			return new Equipamento(id, descricaoCurta, especificacoes, garantia, status);
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro na extração do equipamento. Motivo: " + e.getMessage());
		}

	}

}
