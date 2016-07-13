package br.com.esec.factories;

import br.com.esec.interfaces.Color;
import br.com.esec.interfaces.Shape;

public class AbstractFactoryPattern {
	public static void main(String[] args) {

		// Busca a fábrica de SHAPE
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// Com a fábrica, busca o objeto de shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		shape1.draw();

		// Com a fábrica, busca o objeto de shape Circle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		shape2.draw();

		// Com a fábrica, busca o objeto de Shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");

		shape3.draw();

		// Aqui chamo a fábrica de COLOR, usando a AbstractFactory() que é
		// genérica
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// // Com a fábrica, busca o objeto Color Red
		Color color1 = colorFactory.getColor("RED");

		color1.fill();

		// // Com a fábrica, busca o objeto de Color Green
		Color color2 = colorFactory.getColor("Green");

		color2.fill();

		// // Com a fábrica, busca o objeto de Color Blue
		Color color3 = colorFactory.getColor("BLUE");

		// call fill method of Color Blue
		color3.fill();
	}
}
