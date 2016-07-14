package br.com.esec.shapes;

import br.com.esec.interfaces.AbstractShape;

public class Rectangle implements AbstractShape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}