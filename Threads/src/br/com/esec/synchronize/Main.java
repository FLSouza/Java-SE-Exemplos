package br.com.esec.synchronize;

public class Main {
	
	//Cria 4 Threads(Convidados) que depois de sincronizadas, só uma delas poderá acessar o banheiro por vez.
	//Ou seja, as Threads criadas não podem acessar o objeto Banheiro ao mesmo tempo.
	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();

		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
		Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Maria");
		Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Ana");

		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
	}
}
