package br.com.esec.apacheCommonsIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

//Nesse exemplo vai ser mostrado como seria feita a leitura e escrita de forma
//tradicional e como seria feito com a biblioteca Apache Commons IO.
public class CommonsIO {
	public static void main(String[] args) throws MalformedURLException, IOException {

		System.out.println("LEITURA E ESCRITA COM JAVA.IO");
		// Forma tradicional com java.io
		InputStream in = new URL("https://certillion.com/").openStream();
		try {
			InputStreamReader inR = new InputStreamReader(in);
			BufferedReader buf = new BufferedReader(inR);
			String line;
			while ((line = buf.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			in.close();
		}

		// Com Commons IO a classe IOUtils faz toda a parte de input e output
		System.out.println("LEITURA E ESCRITA COM APACHE COMMONS IO");
		InputStream inApache = new URL("http://commons.apache.org").openStream();
		try {
			System.out.println(IOUtils.toString(inApache));
		} finally {
			IOUtils.closeQuietly(in);
		}
	}
}
