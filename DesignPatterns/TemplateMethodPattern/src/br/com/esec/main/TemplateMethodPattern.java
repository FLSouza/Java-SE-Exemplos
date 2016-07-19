package br.com.esec.main;

import br.com.esec.template.Cricket;
import br.com.esec.template.Football;
import br.com.esec.template.Game;

public class TemplateMethodPattern {
	public static void main(String[] args) {
		// Cricket() FootBall() extend Game() sem modificar o template definido.
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
