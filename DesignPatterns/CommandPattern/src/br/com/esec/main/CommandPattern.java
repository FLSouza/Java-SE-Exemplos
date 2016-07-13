package br.com.esec.main;

import br.com.esec.stocks.BuyStock;
import br.com.esec.stocks.SellStock;
import br.com.esec.stocks.Stock;

public class CommandPattern {
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
