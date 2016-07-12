package br.com.esec.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	// O Funcionario() nesse exemplo é um type parameter.
	// O compilador garante que só iremos usar objetos de tipos compatíveis com
	// a coleção.
	List<Funcionario> funcionarios = new ArrayList<>();

	// Não é necessário garantir com um cast o objeto que é pegado da coleção
	Funcionario func = funcionarios.get(0);

}

class Funcionario {
	private String nome;
}
