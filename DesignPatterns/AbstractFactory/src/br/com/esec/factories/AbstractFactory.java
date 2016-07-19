package br.com.esec.factories;

import br.com.esec.interfaces.AbstractShape;

public abstract class AbstractFactory {

	// Declara o método createShape(), esse método é responsável por 
	// retornar um objeto do tipo AbstractShape(), que irá "desenhar" o
	// o shape desejado.
	public abstract AbstractShape createShape();

	public static AbstractFactory createConcreteFabric(Configuration conf) throws Exception {

		if (conf.getShape().equalsIgnoreCase("CIRCLE")) {
			return new CircleFactory();

		} else if (conf.getShape().equalsIgnoreCase("RECTANGLE")) {
			return new RectangleFactory();
		} else {
			throw new Exception("Configuração de shape não definida.");
		}
	}
}