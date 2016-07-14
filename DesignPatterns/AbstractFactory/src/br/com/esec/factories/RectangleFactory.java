package br.com.esec.factories;

import br.com.esec.interfaces.AbstractShape;
import br.com.esec.shapes.Rectangle;

public class RectangleFactory extends AbstractFactory {

	@Override
	public AbstractShape createShape() {

		return new Rectangle();
	}

}
