package br.com.esec.shapes;

import br.com.esec.interfaces.DrawAPI;

// Classe abstrata usando DrawAPI interface
public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}