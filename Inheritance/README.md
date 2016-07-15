# Java 8 Default

Métodos Default permitem que novas funcionalidades sejam implementas sem quebrar a Classe.

# Upcasting and downcasting

Permintem o uso do polimorfismo. Com upcasting um objeto do tipo subclasse pode ser tratado como um objeto do tipo superclasse. O upcasting já é feito de forma automática, diferente do downcasting que precisa ser feito manualmente pelo programador.

# Composição vs Herança

O aconselhável é usar composição, preferir sempre "Tem-Um" ao invés de "É-UM". A herança deve ser utilizada com muita prudência em pouquíssimas situações.

# Problema do diamante

Java não suporta herança múltipla, não é possível estender dois objetos ao mesmo tempo. Um exemplo básico seria, duas classes **B** e **C** derivando da mesma classe, a classe **A**. Inserindo mais uma, a classe **D** que deriva de ambas **B** e **C** resultaria herança múltipla. Essas ligações formariam o desenho de uma diamante, por isso o nome. O problema da herança múltipla seria encontrado quando se tentasse instanciar um objeto da classe **D**, qualquer chamada de método da classe **A** seria ambíguo, pois não se saberia ao certo qual versão do método chamar, o da classe **B** ou classe **C**.

Uma maneira de simular herança múltipla em Java seria usando composição, através de uma **inner class**. Isso é possível criando uma classe dentro de outra classe. No exemplo abaixo a classe **OuterClass()** herda `java.io.InputStream`, sobrescreve o método read() e em seguida cria a classe **InnerClass** que herda `java.util.Observable`.

	import java.io.IOException;
	import java.io.InputStream;
	import java.util.Observable;
	
	
	public class OuterClass extends InputStream {

		@Override
		public int read() throws IOException {
			// TODO Auto-generated method stub
			return 0;
		}

		class InnerClass extends Observable {

		}

	}
	
É possível criar uma instância de **InnerClass()** de dentro de **OuterClass()**  e inlusive ter acesso às variáveis da classe externa através da **InnerClass()** de acordo com exemplo abaixo:

	import java.io.IOException;
	import java.io.InputStream;
	import java.util.Observable;
	
	
	public class OuterClass extends InputStream {

		private int privInt = 10;

		@Override
		public int read() throws IOException {
			// TODO Auto-generated method stub
			return 0;
		}

		// Cria uma instância de InnerClass() de dentro da classe OuterClass
		public void createInnerClass() {
			InnerClass inClass = new InnerClass();
			inClass.accessOuter();
		}

		// InnerClass() consegue acessar a variável privInt de OuterClass()
		class InnerClass extends Observable {
			public void accessOuter() {
				System.out.println("The outer class's privInt is " + privInt);
			}
		}

	}

É possível instânciar **InnerClass()** de fora de **OuterClass()**:

	public static void main(String[] args) {
	
		// Primeiro cria uma instância de OuterClass()
		OuterClass outClass = new OuterClass();
		
		// Instância InnerClass()
		OuterClass.InnerClass inner = outClass.new InnerClass(); 
		inner.accessOuter();
	}.
