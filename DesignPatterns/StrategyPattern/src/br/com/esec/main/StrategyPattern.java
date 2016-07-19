package br.com.esec.main;

import br.com.esec.strategy.CreditCardStrategy;
import br.com.esec.strategy.PaypalStrategy;

public class StrategyPattern {
	// Esse exemplo usa um carrinho de comprar onde são usadas
	// duas estratégias de pagamento, Cartão de crédito ou PayPal.
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		Item item1 = new Item("1212", 20);
		Item item2 = new Item("3457", 60);

		carrinho.adicionaItem(item1);
		carrinho.adicionaItem(item2);

		// pay by paypal
		carrinho.paga(new PaypalStrategy("myemail@example.com", "mypwd"));

		// pay by credit card
		carrinho.paga(new CreditCardStrategy("Felipe Lara", "1234567890123456", "786", "12/15"));
	}
}
