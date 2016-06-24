package br.com.esec.imprimeNumeros;

public class Teste {
	public static void main(String[] args) {
		new Thread(new TarefaImprimeNumeros()).start();
		new Thread(new TarefaImprimeNumeros()).start();

	}

}
