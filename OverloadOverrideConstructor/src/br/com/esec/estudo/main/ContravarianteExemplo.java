package br.com.esec.estudo.main;

public class ContravarianteExemplo {
	// Exemplo de retorno Contravariante.
	class Super {
		String getSomething() {
			// Faz alguma coisa
			return null;
		}
	}
/*
	class Sub extends Super {
		// A alteração do retorno do método é incompatível
		// desrespeitando a herança, Object() não herda de String().
		Object getSomething() { <---- ERRO
			// Faz alguma coisa
			return null;
		}
	}

*/
}