package br.com.esec.colors;

import br.com.esec.interfaces.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}