package br.com.esec.util;

import br.com.esec.interfaces.Item;
import br.com.esec.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}