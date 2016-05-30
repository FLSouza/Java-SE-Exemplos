class Calculo {
	int z;

	public void soma(int x, int y) {
		z = x + y;
		System.out.println("A soma dos números dados é:" + z);
	}

	public void subtracao(int x, int y) {
		z = x - y;
		System.out.println("A diferença entre os números dados:" + z);
	}
}

// A classe MeuCalculo herda a classe Calculo.
// Como consequência da herança, os métodos de soma e subtração também são herdados.
public class MeuCalculo extends Calculo {
	// A classe MeuCalculo adiciona mais um método(multiplicacao) que a classe
	// Calculo não pode enxergar.
	public void multiplicacao(int x, int y) {
		z = x * y;
		System.out.println("O produto dos números dados:" + z);
	}

	public static void main(String[] args) {
		int a = 20, b = 10;
		MeuCalculo meuCalculo = new MeuCalculo();
		meuCalculo.soma(a, b);
		meuCalculo.subtracao(a, b);
		meuCalculo.multiplicacao(a, b);
	}
}