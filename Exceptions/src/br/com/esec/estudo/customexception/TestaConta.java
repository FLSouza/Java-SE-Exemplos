package br.com.esec.estudo.customexception;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta(1);
		System.out.println("Depositando R$1000...");
		conta.deposita(1000);
		// Trata a exceção que é repassada pelo método saca.
		try {
			System.out.println("\nSacando R$500...");
			conta.saca(500);
			System.out.println("\nSacando R$700...");
			conta.saca(700);
		} catch (InsufficientFundsException e) {
			System.out.println("Você não possui saldo suficiente R$" + e.getAmount());
			e.printStackTrace();
		}
	}
}
