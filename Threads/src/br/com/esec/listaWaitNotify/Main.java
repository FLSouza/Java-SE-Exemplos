package br.com.esec.listaWaitNotify;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Lista lista = new Lista(); // Lista feita na mão com synchronized
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}

		new Thread(new TarefaImprimir(lista)).start();
	}
}
