
public class Estoque {

	private int quantidade;

	private String descricao;

	public Estoque(String descricao, int quantidade) {
		this(quantidade);
		if (descricao != null) {
			this.descricao = descricao;
		} else {
			this.descricao = "";
		}
	}

	public Estoque(int quantidade) {
		this.setQuantidade(quantidade);

	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 0) {
			this.quantidade = quantidade;

		} else {
			System.out.println("A quantidade não pode ser nula");
		}

	}

	public int getQuantidade() {
		return quantidade;

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	void transferirPara(Estoque outroEstoque, int quantidadeTransferida) {
		if (this.quantidade > 0) {
			outroEstoque.quantidade += quantidadeTransferida;
			this.quantidade -= quantidadeTransferida;
		} else {
			System.out.println("Estoque com quantiade insuficiente");
		}
	}

}
