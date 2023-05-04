package classes;

public class Pessoa {

	private char sexo;
	private Double renda;
	private Integer idade;
	private Boolean isEmpregrado;

	public Pessoa() {

	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Boolean getIsEmpregrado() {
		return isEmpregrado;
	}

	public void setIsEmpregrado(Boolean isEmpregrado) {
		this.isEmpregrado = isEmpregrado;
	}

}
