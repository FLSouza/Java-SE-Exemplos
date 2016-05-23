package br.com.esec.estudo;

public class UncheckedExceptions {
	public static void main(String[] args) {
		int[] array = new int[10];
		// Exemplo de Unchecked Exception, essa exceção deve ser tratada em tempo
		// de execução. A execução é interrompida caso a exceção não tenha sido tratada.
		try {
			for (int i = 0; i < 15; i++) {
				array[i] = i;
				System.out.println();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e);
		}

		System.out.println("É escrito somente se a exceção tiver sido tratada");
	}
}
