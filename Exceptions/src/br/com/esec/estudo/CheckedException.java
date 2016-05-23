package br.com.esec.estudo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

public class CheckedException {
	public static void main(String[] args) {
		FileReader fr = null;
		File file = new File("file.txt");
		// Exemplo de Checked Exception, essa exceção deve ser tratada em tempo
		// de compilação, o código não compila caso a exceção não tenha sido
		// tratada.
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found! " + e);
			// O finally é sempre executado, auxiliando no fechamento do
			// recurso.
		} finally {
			try {
				// Fecha o recurso
				fr.close();
			} catch (IOException e) {
				System.out.println("Error:" + e);
			}
		}

		// Fecha o recurso automaticamente. O recurso utilizado é declarado
		// entre parênteses logo depois do try
		try (FileReader fileReader = new FileReader("file.txt")) {
			char[] a = new char[50];
			fileReader.read(a);
			for (char c : a) {
				System.out.println(c);
			}
		} catch (Exception e) {

			System.out.println("Error:" + e);
		}

	}
	
	//Usar o  termo throws em frente ao método passa a responsabilidade do tratamento da exceção a
	//a quem for invocar este método.
	public void deposita(double quantia) throws RemoteException {
		//O throw, no singular, é usado para invocar a exceção explicitamente.
		throw new RemoteException();
	}
}
