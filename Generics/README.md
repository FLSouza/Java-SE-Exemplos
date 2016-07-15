# Generics  

Foi introduzido no Java 5 e permite que tipos sejam passados como parâmetros para classes, declaração de métodos e interfaces.

	Ex.
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
O parâmetro ? wildcard é interpretador com um tipo desconhecido. Você pode adicionar qualquer tipo de objeto na variável de referência. No entando, depois de usado wildcard não podemos assumir mais nenhum tipo de objeto dentro da lista. 

	Ex.
	List<?>
	
# The Diamond Operator

Foi incluído no Java 7 para diminuir a verbosidade no uso de Generics
	
	//Não preciso declarar duas vezes o tipo que será usado 
	Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
	//Dessa maneira fica menos verboso
	Map<String, List<String>> anagrams = new HashMap<>();

# Type Erasure

É o processo em que o compilador Java "apaga" a informação do tipo genérico em uma classe, como no exemplo a seguir: 
	
	// Declarando o tipo genérico como String
	List<String> nickNames = new ArrayList<String>();
	nickNames.add("Foo");
	String nickName = nickNames.get(0);

	// Depois de compilado a informação do tipo genérico é apagada.
	// Um cast é criado para substituir o generic.
	List nickNames = new ArrayList();
	nickNames.add("Foo");
	String nickName = (String) nickName.get(0); <----- É criado um cast
	
Com a informação sendo apagada em tempo de execução o exemplo de código a seguir resultaria em **true**:

	// Cria dois ArrayList<> com tipos genéricos diferentes 
	ArrayList<Integer> li = new ArrayList<Integer>();
	ArrayList<Float> lf = new ArrayList<Float>();
	
	// A comparação será feita em tempo de execução, depois que a informação do 	// tipo genérico tiver sido apagada. O resultado será verdadeiro, pois irá 
	// considerar os dois ArrayList com tipos iguais.
	if (li.getClass() == lf.getClass()) { // o resultado é true
		System.out.println("Equal");
	}

	
Java optou por usar **erased generic** ao invés de **reified generics**, que preservaria a informação do tipo genérico. Essa opção foi devido necessidade de manter a retrocompatibilidade com antigas versões de JVMs. 