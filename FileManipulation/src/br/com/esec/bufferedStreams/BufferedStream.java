package br.com.esec.bufferedStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//Nesse exemplo copiamos um arquivo e criamos outros arquivo com os dados copiados.
//É usado Buffered Stream, dessa maneira o disco não é utilizado durante a cópia,
//tudo fica salvo no buffer.
public class BufferedStream {
	public static void main(String[] args) {
		try (
				//Coloco todos os bytes do arquivo especificado em inputstream
				InputStream inputStream = new FileInputStream(
						"imagem.jpg");
				//A cópia será salva no outputStream
				OutputStream outputStream = new FileOutputStream("output.jpg");

				
				//Nessa etapa os Byte Streams são envelopados no Buffered Streams
				BufferedInputStream bufferIn = new BufferedInputStream(inputStream);
				BufferedOutputStream bufferOut = new BufferedOutputStream(outputStream)) {

			//O buffer é criado para leitura dos arquivos
			byte[] buffer = new byte[1024];

			//Lendo e escrevendo até o fim do arquivo
			while (bufferIn.read(buffer) != -1) {

				bufferOut.write(buffer);
			}
			System.out.println("Arquivo copiado");
		} catch (FileNotFoundException e) {
			System.out.println("Input file não encontrado");
		} catch (IOException e) {
			System.out.println("Erro nas operações de leitura e escrita");
		}
	}
}
