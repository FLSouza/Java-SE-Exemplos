package br.com.esec.main;

import br.com.esec.decorator.RedShapeDecorator;
import br.com.esec.interfaces.Shape;
import br.com.esec.shapes.Circle;
import br.com.esec.shapes.Rectangle;

public class DecoratorPattern {
	public static void main(String[] args) {
		
		Shape circle = new Circle();
		
		//Nesse exemplo Shape() recebe Decorator() sem que a classe shape
		//seja alterada.
		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
