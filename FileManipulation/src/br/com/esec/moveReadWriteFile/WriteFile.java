package br.com.esec.moveReadWriteFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream é utilizado para lidar com dados binários, ele é o responsável por 
//escrever os dados no arquivo.
//É necessário converter os dados em bytes para depois escrevê-los no arquivo.
public class WriteFile {
	public static void main(String[] args) {

		File file = new File("novoArquivo.txt");
		String content = "Esse é o conteudo do arquivo!";

		try (FileOutputStream fop = new FileOutputStream(file)) {

			if (!file.exists()) {
				file.createNewFile();
			}

			// Pega o conteudo em bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
