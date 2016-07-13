package br.com.esec.itens;

import br.com.esec.util.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}