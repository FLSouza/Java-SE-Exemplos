package br.com.esec.factories;

import java.util.HashMap;

import br.com.esec.interfaces.Shape;
import br.com.esec.shapes.Circle;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();
	
	// Nesse exemplo ShapeFactory() tem um HashMap de Circle.
	// Quando uma request é feita para criar um circulo, antes é checado 
	// se o circulo com as especificações desejadas já existe no HashMap,
	// caso exista esse objeto é retornado, senão é criado um novo objeto.
	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
