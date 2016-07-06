package br.com.esec.deadlockDesafio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Deadlock {
	public static File arquivo1 = new File("assinaturas1.txt");
	public static File arquivo2 = new File("assinaturas2.txt");

	public static void main(String[] args) {
		// new Thread(new leArquivoUmOrdem(arquivo1,arquivo2)).start();
		// new Thread(new leArquivoOutraOrdem(arquivo1,arquivo2)).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (arquivo1) {
					try {
						Scanner scanner = new Scanner(arquivo1);
						while (scanner.hasNextLine()) {
							System.out.println(scanner.nextLine() + " assinatura1 - 1");
						}
						scanner.close();
					} catch (FileNotFoundException e) {
						throw new RuntimeException(e);
					}
					synchronized (arquivo2) {
						try {
							Scanner scanner = new Scanner(arquivo2);
							while (scanner.hasNextLine()) {
								System.out.println(scanner.nextLine() + " assinatura2 - 1");
							}
							scanner.close();
						} catch (FileNotFoundException e) {
							throw new RuntimeException(e);
						}

					}

				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (arquivo2) {
					try {
						Scanner scanner = new Scanner(arquivo2);
						while (scanner.hasNextLine()) {
							System.out.println(scanner.nextLine() + " assinatura2 - 2");
						}
						scanner.close();
					} catch (FileNotFoundException e) {
						throw new RuntimeException(e);
					}
					synchronized (arquivo1) {
						try {
							Scanner scanner = new Scanner(arquivo1);
							while (scanner.hasNextLine()) {
								System.out.println(scanner.nextLine() + " assinatura1 - 2");
							}
							scanner.close();
						} catch (FileNotFoundException e) {
							throw new RuntimeException(e);
						}

					}

				}
			}
		}).start();
	}
}
