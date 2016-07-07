# Formatação de Strings 

Para formatar Strings em Java existem dois métodos: 

	format() --> java.lang.String
	printf() --> PrintStream class

# Regular Expression

Para realizar busca e extração com expressões regulares duas classes são usadas:

	//Pattern compila uma expressão regular especificada em uma String.
	//O resultado dessa compilação é usado para criar o objeto Matcher com o método
	//matcher() 
	java.util.regex.Pattern
	
	//O Matcher criado usa o método matches() para fazer a busca.
	//Além do método matches(), existem tabém os métodos de busca lookingAt() e find() 
	java.util.regex.Matcher

