package br.com.esec.factories;

import br.com.esec.interfaces.Color;
import br.com.esec.interfaces.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}