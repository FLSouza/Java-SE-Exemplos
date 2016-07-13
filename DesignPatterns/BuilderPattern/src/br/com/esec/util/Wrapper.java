package br.com.esec.util;

import br.com.esec.interfaces.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}
}