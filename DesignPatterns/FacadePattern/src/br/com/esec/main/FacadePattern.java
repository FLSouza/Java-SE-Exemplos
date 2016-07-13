package br.com.esec.main;

import br.com.esec.shapes.ShapeMaker;

public class FacadePattern {
	public static void main(String[] args) {
		
		//Nesse exemplo ShapeMaker() esconde a complexidade do sistema
		//provendo uma interface que facilita a interação do usuário com o sistema
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
