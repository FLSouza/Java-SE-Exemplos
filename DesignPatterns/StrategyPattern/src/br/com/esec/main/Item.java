package br.com.esec.main;

public class Item {
	private String codigo;
	private int preco;

	public Item(String upc, int cost) {
		this.codigo = upc;
		this.preco = cost;
	}

	public String getUpcCode() {
		return codigo;
	}

	public int getPrice() {
		return preco;
	}
}
