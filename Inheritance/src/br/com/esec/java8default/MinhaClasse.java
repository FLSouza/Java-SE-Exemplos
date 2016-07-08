package br.com.esec.java8default;

//Neste exemplo MinhaClasse implementa Interface.
//A interface obriga MinhaClasse a implementar o método fazAlgo().
//No Java 8 a inclusão do Default dá a opção de da interface criar métodos que 
//não precisam ser implementados.
public class MinhaClasse implements Interface {
	public static void main(String[] args) {
		MinhaClasse minhaClasse = new MinhaClasse();
		minhaClasse.fazAlgo();
	}

	@Override
	public void fazAlgo() {
		System.out.println("Alguma coisa!");
	}

}

interface Interface {

	public void fazAlgo();

	//Nova funcionalidade do Java 8, não obriga a classe que chamar essa interface
	//a implementar o método outraCoisa
	default public void outraCoisa() {
		System.out.println("Faz outra coisa!");
	}

}
