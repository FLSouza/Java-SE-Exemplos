package br.com.esec.variables;

// A classe StaticVariables() possui uma variável estática
class Estatica {

	public static String name = "Sou uma variável estática!";

}

// A classe Application() irá chamar a variável "name" sem
// criar um objeto para a classe StaticVariable().
// Isso é possível porque o objeto estático pertence a classe.
class VariaveisEstaticas {

	public static void main(String[] args) {
		System.out.println(Estatica.name);
	}

}
