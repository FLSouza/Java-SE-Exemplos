package br.com.esec.state;

import java.io.IOException;
import java.io.InputStreamReader;

class Chain {
	private State current;

	public Chain() {
		current = new Off();
	}

	public void setState(State s) {
		current = s;
	}

	// Pega o estado atual e busca o método correto.
	public void pull() {
		current.pull(this);
	}
}

abstract class State {
	public void pull(Chain wrapper) {
		// Toda vez que o método é acionado, um novo estado é setado.
		wrapper.setState(new Off());
		System.out.println("   turning off");
	}
}

class Off extends State {
	public void pull(Chain wrapper) {
		// Toda vez que o método é acionado, um novo estado é setado.
		wrapper.setState(new Low());
		System.out.println("   low speed");
	}
}

class Low extends State {
	public void pull(Chain wrapper) {
		// Toda vez que o método é acionado, um novo estado é setado.
		wrapper.setState(new Medium());
		System.out.println("   medium speed");
	}
}

class Medium extends State {
	public void pull(Chain wrapper) {
		// Toda vez que o método é acionado, um novo estado é setado.
		wrapper.setState(new High());
		System.out.println("   high speed");
	}
}

class High extends State {
}

public class StatePattern {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		int ch;
		Chain chain = new Chain();
		while (true) {
			System.out.print("Press 'Enter'");
			ch = is.read();
			ch = is.read();
			chain.pull();
		}
	}
}
