package br.com.esec.adpater;

import java.util.Iterator;

public class Produto {

	// Dessa maneira o método mostraProduto() espera uma interface interator.
	public void mostraProduto(Iterator iterator) {
		for (; iterator.hasNext();)
			System.out.println(iterator.next());
	}

	public static void main(String[] args) {
		Produto produto = new Produto();
		EnumProduto enumProduct = new EnumProduto();
		EnumToIteratorAdapter enumToIteratorAdapter = new EnumToIteratorAdapter(enumProduct.getProduct());
		// O método mostraProdutor() irá aceitar uma interface direferente da esperada
		// devidor ao adapter.
		produto.mostraProduto(enumToIteratorAdapter);
	}
}
