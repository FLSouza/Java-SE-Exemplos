package br.com.esec.factories;

public class AbstractFactoryPattern {
	public static void main(String[] args) {

		// É passado o objeto Configuration() com a String referenciando
		// o shape que deverá ser criado.
		Configuration configuration = new Configuration("RECTANGLE");
		try {
			AbstractFactory.createConcreteFabric(configuration).createShape().draw();
		} catch (Exception e) {
			System.out.println("Error! " + e);
		}
	}
}
