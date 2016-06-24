package br.com.esec.synchronize;

public class Banheiro {
	public void fazNumero1() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");

		// Esse bloco de código fica sincronizado, o objeto está sendo bloqueado
		// para outras Threads que não sejam a Thread atual que está em
		// execução.
		// Outras Threads terão que esperar a primeira Thread que
		// obteve acesso a esse método, terminar de executar o bloco de código
		// sincronizado.
		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo coisa rapida");
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mão");
			System.out.println(nome + " saindo do banheiro");

		}

	}

	// Esse bloco de código fica sincronizado, o objeto está sendo bloqueado
	// para outras Threads que não sejam a Thread atual que está em
	// execução.
	// Outras Threads terão que esperar a primeira Thread que
	// obteve acesso a esse método, terminar de executar o bloco de código
	// sincronizado.
	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo coisa demorada");
			try {
				Thread.sleep(15000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(nome + " lavando a mão");
			System.out.println(nome + " dando descarga");
			System.out.println(nome + " saindo do banheiro");

		}
	}
}
