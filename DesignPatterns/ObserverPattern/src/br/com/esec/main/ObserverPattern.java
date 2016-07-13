package br.com.esec.main;

import br.com.esec.observer.BinaryObserver;
import br.com.esec.observer.HexaObserver;
import br.com.esec.observer.OctalObserver;
import br.com.esec.observer.Subject;

public class ObserverPattern {
	// Quando o subject seta um novo estado setState(), 
	//todos os objetos são notificados.
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
