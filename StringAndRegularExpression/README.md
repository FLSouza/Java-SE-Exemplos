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

TODO: Criar exemplo de *Capturing Groups* e *Backreferences*

# XML

TODO: Acrescentar o item _Comparar parsers SAX e DOM_.

TODO: Trocar o item _Parse e dump de XML com Apache Commons Lang_ por _Parse de XML usando SAX e DOM_.
      Exemplo SAX: http://www.mkyong.com/java/how-to-read-xml-file-in-java-sax-parser/
      Exemplo DOM: http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
