package br.com.esec.factories;

import br.com.esec.interfaces.Shape;
import br.com.esec.shapes.Circle;
import br.com.esec.shapes.Rectangle;
import br.com.esec.shapes.Square;

public class ShapeFactory {
	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
