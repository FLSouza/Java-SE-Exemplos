package br.com.esec.main;

import br.com.esec.factories.ShapeFactory;
import br.com.esec.interfaces.Shape;

public class FactoryPattern {

	// Nesse exemplo é criado uma interface Shape() e classe concretas
	// implementando essa interface.
	// O objeto criado são buscado usando shapeFactory() passando somente a
	// String correspondente.
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// Pega um objeto CIRCLE e chama seu método draw()
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");

		shape3.draw();
	}
}
