package br.com.esec.factories;

import br.com.esec.colors.Blue;
import br.com.esec.colors.Green;
import br.com.esec.colors.Red;
import br.com.esec.interfaces.Color;
import br.com.esec.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}
}