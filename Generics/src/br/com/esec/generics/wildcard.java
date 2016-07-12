package br.com.esec.generics;

import java.util.ArrayList;
import java.util.List;

//Em Generics, collections de um tipo não são polimórficas no tipo
public class wildcard {
	public static void main(String[] args) {
		// Criamos uma lista de objetos Cachorro
		List<Cachorro> cachorros = new ArrayList<Cachorro>();

		// Quando adicionamos um cachorro não temos problema
		cachorros.add(new Cachorro());

		// A linha a seguir compila sem erros
		 List<?> objs = cachorros;

		 // Agora não podemos assumir nenhum tipo de objeto na Lista.
		 // A única maneira de fazer algo seguro é tratar como Object()
		 for (Object o: objs) {
	            System.out.println("String representation: " + o);
	        }
	}
}

class Dog {

}

class Cat {

}