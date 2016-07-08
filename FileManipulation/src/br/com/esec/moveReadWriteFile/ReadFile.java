package br.com.esec.moveReadWriteFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader é a classe mais utilizada para leitura de arquivos
public class ReadFile {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
