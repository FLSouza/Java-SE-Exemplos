package br.com.esec.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Backreferences {
	public static void main(String args[]) {

		// Aqui o grupo ([A-Za-z]) é back-referenced por \\1.
		// É maneira repetir um grupo sem precisar escreve-lo novamente.
		String reg_exxp = "([A-Za-z])[0-9]\\1";

		Pattern p = Pattern.compile(reg_exxp);

		String str = "a9a ";

		Matcher m = p.matcher(str);

		if (m.find()) {
			System.out.println("Resultado: " + m.group());
		}
		
		
		// Aqui a combinação não é verdadeira porque a substring capturada pelo grupo 1
		// não é repetida na última parte da expressão.
		str = "a9b";
		m = p.matcher(str);

		if (m.find()) {
			System.out.println("Resultado: " + m.group());
		}
	}
}
