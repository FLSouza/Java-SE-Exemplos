package br.com.esec.main;

import br.com.esec.colors.GreenCircle;
import br.com.esec.colors.RedCircle;
import br.com.esec.shapes.Circle;
import br.com.esec.shapes.Shape;

public class BridgePattern {
	public static void main(String[] args) {
		
		// Nesse exemplo é possível usar Shape() e DrawAPI para desenhar
		//círculos coloridos diferente.
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
