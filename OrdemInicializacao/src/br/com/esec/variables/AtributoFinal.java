package br.com.esec.variables;

public class AtributoFinal {
	// Valor atribuído somente uma vez na declaração
	final int x = 1;
	
	// Valor atribuído somente uma vez no construtor
	final int y;
	public AtributoFinal(int y) {
		this.y = y;
	}
}
