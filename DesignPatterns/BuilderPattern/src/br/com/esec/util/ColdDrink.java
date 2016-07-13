package br.com.esec.util;

import br.com.esec.interfaces.Item;
import br.com.esec.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}