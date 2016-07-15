package br.com.esec.estudo.main;


// Exemplo de retorno Covariante.
class Super {
	Object getSomething() {
		// Faz alguma coisa
		return null;
	}
}

class Sub extends Super {
	// A alteração do retorno do método é compatível
	// respeitando a herança, String() herda de Object().
	String getSomething() {
		// Faz alguma coisa
		return null;
	}
}