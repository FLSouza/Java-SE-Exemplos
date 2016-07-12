package br.com.esec.variables;

public class BlocosDeInicializacao {
	static int var;
	int valor;

	// Bloco de inicialização estático.
	// A variável de intância (valor) não pode ser acessada dentro do bloco
	// estático.
	static {
		var = 2;
	}

	// Bloco de inicialização de instância
	{
		var = 5;
		valor = 10;
	}
}
