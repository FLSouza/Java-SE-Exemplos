package br.com.esec.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		// Cria um objeto do tipo Date.
		Date now = new Date();

		// Mostra o resultado de toString().
		String dateString = now.toString();
		System.out.println(" 1. " + dateString);

		// Cria o formato que será apresentado na saída do toString()'s.
		SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");

		// Verifica se o parser pode ser feito Date.toString().
		try {
			Date parsed = format.parse(dateString);
			System.out.println(" 2. " + parsed.toString());
		} catch (ParseException pe) {
			System.out.println("ERROR: Cannot parse \"" + dateString + "\"");
		}

		// Formata a data com a padrão criado com SimpleDataFormat().
		System.out.println(" 3. " + format.format(now));
	}
}
