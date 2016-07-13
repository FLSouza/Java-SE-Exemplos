package br.com.esec.main;

import br.com.esec.stocks.BuyStock;
import br.com.esec.stocks.SellStock;
import br.com.esec.stocks.Stock;

public class CommandPattern {
	public static void main(String[] args) {
		
		// Stock age como a request 
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		// O Broker() age como o command pattern, que irá identificar
		// qual objeto vai executar.
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
