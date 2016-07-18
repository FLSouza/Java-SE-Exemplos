package br.com.esec.messageFormat;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Random;

public class MessageFormatExample {

	// Verifica se o número é primo.
	public static boolean isPrime(int n) {
		if (n == 2)
			return true;

		for (int i = 2; i <= (int) Math.sqrt(n) + 1; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {

		int[] nums = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100);
		}

		int primes = 0;

		// Calcula a quantidade de números primos.
		for (int num : nums) {
			if (isPrime(num))
				primes++;
		}

		// Cria o padrão em que a String vai ser formatada.
		String message = "On the test run at {0,time} on {0,date}, we found {1} prime numbers";
		MessageFormat mf = new MessageFormat(message);

		// Pega um conjunto de objetos que serão inseridos nos locais
		// designados na formatação da String.
		System.out.println(mf.format(new Object[] { new Date(), primes }));

	}

}
