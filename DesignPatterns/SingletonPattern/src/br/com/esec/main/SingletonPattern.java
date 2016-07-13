package br.com.esec.main;

public class SingletonPattern {
	public static void main(String[] args) {

		// Acessa o único objeto disponível.
		// O acesso é direto.
		SingleObject object = SingleObject.getInstance();

		// show the message
		object.showMessage();
	}
}