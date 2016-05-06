package br.com.esec.estudo.model;

/**
 * @author fsouza
 *
 */
public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;

	public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		//'super' chama o construtor da classe pai para passar os parâmetros pertencentes a ele
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

	public double getBonificacao(int juros) {
		return getBonificacao() + juros;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

}
