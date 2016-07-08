package br.com.esec.moveReadWriteFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//Devido ao java.io.file não possuir métodos que movam um arquivo de um diretório
//para outro, duas alternativas são usadas para contornar esse problema.
// File.renameTo() ou copiar para o novo arquivo e deletar o arquivos original
public class MoveFile {
	public static void main(String[] args) {

		// Exemplo com File.renameTo()
		try {

			File afile = new File("/Users/fsouza/Desktop/folderA/assinaturas.txt");

			// Usando o método renameTo() é possível
			if (afile.renameTo(new File("/Users/fsouza/Desktop/folderB/" + afile.getName()))) {
				System.out.println("O arquivo foi movido!");
			} else {
				System.out.println("O arquivo não pode ser movido!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Copiando e deletando
		InputStream inStream = null;
		OutputStream outStream = null;

		try {

			// Aqui são criados dois arquivos
			File afile = new File("/Users/fsouza/Desktop/folderA/assinaturas.txt");
			File bfile = new File("/Users/fsouza/Desktop/folderB/assinaturas.txt");

			inStream = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {

				outStream.write(buffer, 0, length);

			}

			inStream.close();
			outStream.close();

			// Depois que o arquivo foi copiado para o segundo diretório, o
			// primeiro é deletado.
			afile.delete();

			System.out.println("File is copied successful!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
