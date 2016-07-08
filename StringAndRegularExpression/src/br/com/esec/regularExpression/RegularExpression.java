package br.com.esec.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExpression {

	public static void main(String[] args) {
		Pattern pattern;
		Matcher matcher;

		// Regra específicada na String
		// ^ - início da linha
		// [a-z0-9_-] - Busca esses caracteres
		String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

		// Compila as regras da expressão regular e atribui ao pattern
		pattern = Pattern.compile(USERNAME_PATTERN);

		// Cria o matcher com o input que vai ser comparado ao pattern
		matcher = pattern.matcher("felipelara_");

		// Faz a busca comparando a expressão regular com o input
		boolean bool = matcher.matches();

		if (bool) {
			System.out.println("Username correto!");
		} else {
			System.out.println("Username Fora dos padrões");
		}
	}
}
