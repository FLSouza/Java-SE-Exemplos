package br.com.esec.shapes;

import br.com.esec.interfaces.AbstractShape;

public class Circle implements AbstractShape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}