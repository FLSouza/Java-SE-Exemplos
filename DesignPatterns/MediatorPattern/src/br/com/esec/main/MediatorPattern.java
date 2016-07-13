package br.com.esec.main;

import br.com.esec.chat.User;

public class MediatorPattern {
	
	// Nesse exemplo o objeto User() usa o método do ChatRoom() para 
	// compartilhar suas mensagens.
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
