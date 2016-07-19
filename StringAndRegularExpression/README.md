# Formatação de Strings 

Para formatar Strings em Java existem dois métodos: 

	format() --> java.lang.String
	printf() --> PrintStream class

# MessageFormat(java.text.MessageFormat)

É uma classe que pega um conjunto de objetos, formata esses objetos para depois inseri-los nos locais corretos da String formatada. 

# SimpleDateFormat(java.text.SimpleDateFormat)

Permite que strings com informações sobre data e tempo sejam convertidas para e de objetos **java.util.Date**. 

# Regular Expression

Para realizar busca e extração com expressões regulares duas classes são usadas:

	//Pattern compila uma expressão regular especificada em uma String.
	//O resultado dessa compilação é usado para criar o objeto Matcher com o método
	//matcher() 
	java.util.regex.Pattern
	
	//O Matcher criado usa o método matches() para fazer a busca.
	//Além do método matches(), existem tabém os métodos de busca lookingAt() e find() 
	java.util.regex.Matcher


# XML (SAX Parser)

É mais rápido e usa menos memória do que o DOM parser. Não carrega o documento na memória, nem cria um objeto representando o documento de xml. Ele usa uma função callback para mostrar a estrutura do documento de XML.

# XML (DOM Parser)

Ao contrário do SAX, o documento é jogado em memória onde modelado em uma estrutura "TREE" para fácil manipulação. É lento e consome bastante memória quando carrega um documento que possui bastante conteudo.

