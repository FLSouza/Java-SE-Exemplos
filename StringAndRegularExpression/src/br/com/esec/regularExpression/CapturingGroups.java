package br.com.esec.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingGroups {
	public static void main(String args[]) {
		String line = "Primeiro grupo Sg2000! Terceiro grupo!";
		// Os grupos são divididos por parenteses
		Pattern pattern = Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher matcher = pattern.matcher(line);

		// Busca o resultado da expression por grupo de acordo com o padrão
		// criado.
		while (matcher.find()) {
			System.out.println("group 1: " + matcher.group(1));
			System.out.println("group 2: " + matcher.group(2));
			System.out.println("group 3: " + matcher.group(3));
		}
	}

}
