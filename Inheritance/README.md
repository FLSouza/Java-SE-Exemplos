# Java 8 Default

Métodos Default permitem que novas funcionalidades sejam implementas sem quebrar a Classe.

# Upcasting and downcasting

Permintem o uso do polimorfismo. Com upcasting um objeto do tipo subclasse pode ser tratado como um objeto do tipo superclasse. O upcasting já é feito de forma automática, diferente do downcasting que precisa ser feito manualmente pelo programador.

# Composição vs Herança

O aconselhável é usar composição, preferir sempre "Tem-Um" ao invés de "É-UM". A herança deve ser utilizada com muita prudência em pouquíssimas situações.

TODO: Explicar o que é o problema do diamante e por que Java escolheu não ter herança múltipla.

TODO: Suponha que você queria criar uma classe que herda tanto de `java.io.InputStream` quanto de `java.util.Observable`.
      Como Java não tem herança múltipla, explique como você conseguiria simular isso usando composição (dica: inner class).
