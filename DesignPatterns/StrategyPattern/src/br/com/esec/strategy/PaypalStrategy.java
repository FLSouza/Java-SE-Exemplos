package br.com.esec.strategy;

import br.com.esec.interfaces.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;

	public PaypalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public void paga(int amount) {
		System.out.println(amount + " pagou usando Paypal.");
	}

}