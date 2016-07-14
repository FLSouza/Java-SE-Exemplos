package br.com.esec.factories;

import br.com.esec.interfaces.AbstractShape;
import br.com.esec.shapes.Circle;

public class CircleFactory extends AbstractFactory {

	@Override
	public AbstractShape createShape() {
		return new Circle();
	}

}
