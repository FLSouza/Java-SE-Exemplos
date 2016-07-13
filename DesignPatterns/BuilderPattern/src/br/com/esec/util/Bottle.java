package br.com.esec.util;

import br.com.esec.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}