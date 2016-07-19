package br.com.esec.strategy;

import br.com.esec.interfaces.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

	private String nome;
	private String cardNumber;
	private String cvv;
	private String dataDeExpiracao;

	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.nome = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dataDeExpiracao = expiryDate;
	}

	@Override
	public void paga(int amount) {
		System.out.println(amount + " pagou com cartao de credito/debito ");
	}

}