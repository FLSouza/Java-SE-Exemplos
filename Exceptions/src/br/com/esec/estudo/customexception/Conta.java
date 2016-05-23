package br.com.esec.estudo.customexception;

public class Conta {
	private int valor;
	private double total;

	public Conta(int valor) {
		this.valor = valor;
	}

	public void deposita(double quantia) {
		total += quantia;
	}
	//Toda vez que o método saca for invocado, seré necessário tratar a exception
	//customizada.
	public void saca(double quantia) throws InsufficientFundsException {
		if (quantia <= total) {
			total -= quantia;
		} else {
			double excedente = quantia - total;
			throw new InsufficientFundsException(excedente);
		}
	}

	public int getValor() {
		return valor;
	}

	public double getTotal() {
		return total;
	}

}
