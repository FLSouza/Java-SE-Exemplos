package br.com.esec.imprimeString;

//Herdar de Thread é uma má prática, sempre implemente Runnable
public class Imprime extends Thread {
	private String string;

	public Imprime(String string) {
		this.string = string;
	}

	@Override
	public void run() {
		System.out.println(string);
	}

}
