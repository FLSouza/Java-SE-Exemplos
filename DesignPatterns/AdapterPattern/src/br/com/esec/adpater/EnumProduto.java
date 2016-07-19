package br.com.esec.adpater;

import java.util.Enumeration;
import java.util.Vector;

public class EnumProduto {
	private Vector<String> product;

	public EnumProduto() {
		product = new Vector<String>();
		setProduct("Produto A");
		setProduct("Produto B");
		setProduct("Produto C");
	}

	public void setProduct(String s) {
		product.add(s);
	}

	public Enumeration<String> getProduct() {
		Enumeration<String> eProduct = product.elements();
		return eProduct;
	}
}
