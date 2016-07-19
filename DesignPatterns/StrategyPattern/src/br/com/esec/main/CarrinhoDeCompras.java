package br.com.esec.main;

import java.util.ArrayList;
import java.util.List;

import br.com.esec.interfaces.PaymentStrategy;

public class CarrinhoDeCompras {
	// Lista de itens
	List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}

	public void adicionaItem(Item item) {
		this.itens.add(item);
	}

	public void removeItem(Item item) {
		this.itens.remove(item);
	}

	public int calculaTotal() {
		int sum = 0;
		for (Item item : itens) {
			sum += item.getPrice();
		}
		return sum;
	}

	public void paga(PaymentStrategy paymentMethod) {
		int amount = calculaTotal();
		paymentMethod.paga(amount);
	}
}
