package br.com.esec.colors;

import br.com.esec.interfaces.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
