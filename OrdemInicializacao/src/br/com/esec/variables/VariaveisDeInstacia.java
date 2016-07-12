package br.com.esec.variables;

class Cachorro {
	public String cor = "Marrom";
}

class VariaveisDeInstacia {
	public static void main(String[] args) {
		// Instanciando dois objetos do tipo Cachorro.
		// Cada objeto criado terá sua própria variável (cor).
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();

		// Alterando a cor do objeto c1() não altera a cor do objeto c2()
		c1.cor = "Amarelo";
		System.out.println(c1.cor);
		System.out.println(c2.cor);

	}

}