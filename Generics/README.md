# Generics  

Foi introduzido no Java 5 e permite que tipos sejam passados como parâmetros para classes, declaração de métodos e interfaces.

	Ex.
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
O parâmetro ? wildcard é interpretador com um tipo desconhecido. Você pode adicionar qualquer tipo de objeto na variável de referência. No entando, depois de usado wildcard não podemos assumir mais nenhum tipo de objeto dentro da lista. 

	Ex.
	List<?>
	
# The Diamont Operator

Foi incluído no Java 7 para diminuir a verbosidade no uso de Generics
	
	//Não preciso declarar duas vez o tipo que será usado 
	Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
	//Dessa maneira fica menos verboso
	Map<String, List<String>> anagrams = new HashMap<>();

TODO: Explicar o que é *Type Erasure* e qual a consequência de Java não ter *Reified Generics*.
