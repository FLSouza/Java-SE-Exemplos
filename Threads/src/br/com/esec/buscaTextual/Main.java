package br.com.esec.buscaTextual;

//Busca nome em três arquivos de texto diferentes. 
//Cada procura é feita em uma Thread diferente.
public class Main {
	public static void main(String[] args) {
		// String nomeProcurado = "Jon";
		//Procurando pelo nome com expressões regulares
		String nomeProcurado = "(Dan|Chad)(\\s|\\w)*";
		Thread threadAutores = new Thread(new TarefaBuscaNome("autores.txt", nomeProcurado));
		Thread threadAssinaturas1 = new Thread(new TarefaBuscaNome("assinaturas1.txt", nomeProcurado));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nomeProcurado));

		threadAutores.start();
		threadAssinaturas1.start();
		threadAssinaturas2.start();
	}
}
