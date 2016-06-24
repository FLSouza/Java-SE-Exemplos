package br.com.esec.imprimeString;

public class Main {
	public static void main(String[] args) {
		// Runnable imprimeStr = new Imprime("String impressa!");
		// Thread thread = new Thread(imprimeStr);
		// thread.start();

		// ---Herdar de Thread é uma má prática, sempre implemente Runnable---
		// Imprime imprime = new Imprime("String impressa!");
		// imprime.start();

		//---Forma mais enxuta, não é preciso criar uma classe separada que representa a tarefa---
		//---Tudo é feito dentro da classe---
		//---TIP: Classe anônimas dificultam a leitura---
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Forma mais enxuta!");
			}
		}).start();
	}
}
