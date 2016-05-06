package br.com.esec.estudo.main;

import br.com.esec.estudo.model.Funcionario;
import br.com.esec.estudo.model.Gerente;

public class OverloadOverrideConstructorMain {
	public static void main(String[] args) {

		// Usa o método construtor que obriga a passagem de parâmetros
		Gerente gerente = new Gerente("Felipe Lara", "73863947134", 5000, 12345678, 4);
		gerente.setNome("Felipe Lara");
		gerente.setSenha(1234);
		gerente.setSalario(5000.0);
		// Utiliza a sobrescrita(override). Chama o método sobrescrito da classe
		// gerente
		System.out.println(gerente.getBonificacao());

		// Usa a classe funcionario para refenciar o método do gerente
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000.0);
		System.out.println(funcionario.getBonificacao());

		// Usa sobrecarga(overload). Chama o método sobrecarregado com parâmetro
		// da classe gerente
		System.out.println(gerente.getBonificacao(200));

	}
}
