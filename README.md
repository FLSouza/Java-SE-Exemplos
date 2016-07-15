# Java-SE-Exemplos

	= Treinamento completo de Java
	Alex Oliveira <aoliveira@esec.com.br>
	versão 1.0 (C) e-Sec Segurança Digital
	
	Esse treinamento engloba desde o uso básico da linguagem Java até a criação de aplicações corporativas completas.
	
	Público-alvo::
	  - Estagiários
	  - Trainees
	
	Pré-requisitos::
	  - Conhecimento de programação intermediário
	  - Conhecimento de Java básico
	  - Sexto semestre da faculdade
	  - Ser autodidata
	
	NOTE: Todos os tópicos devem ser estudados por conta própria e ao final o colaborador deve criar um exemplo de código comentado e publicar em um repositório (interno ou externo) para ser avaliado.
	
	== Parte 1 - Java SE
	
	. Orientação à Objetos
	.. Sobrecarga (overload) e sobrescrita (override) de métodos
	    - Declarar e invocar.
	    - Variância dos tipos dos argumentos, retorno e exceções.
	.. Construtores:
	    - Sobrecarga.
	    - Delegação.
	    - Construtor padrão.
	    - Chamada ao construtor da classe pai.
	    - O que não se deve fazer dentro de um construtor.
	.. Ordem de inicialização:
	    - Variáveis estáticas.
	    - Blocos de incialização estática.
	    - Variáveis de instância.
	    - Blocos de inicialização de instância.
	    - Atribuição dentro do construtor.
	    - Inicialização de atributo `final`.
	.. Herança:
	    - Classes concretas, abstratas, finais e interfaces.
	    - Problema do diamante.
	    - Uso de composição em vez de herança.
	    - Implementação `default` em Java 8.
	    - Upcast, downcast e sidecast.
	    - Polimorfismo.
	.. Generics:
	    - Generic collections.
	    - Type erasure.
	    - Herança com generics.
	    - Métodos estáticos com generics.
	    - _diamond operator_ em Java 7.
	    - Variância de tipo.
	.. Exceções:
	    - Lançar e capturar exceções.
	    - Exceções vs retorno de erros.
	    - Exceções _checked_ vs _unchecked_.
	    - try-catch-finally do Java 6.
	    - try-with-resource do Java 7.
	
	. Tarefas comuns
	.. Strings e expressões regulares:
	    - Formatação de strings.
	    - Conversão entre data e string.
	    - Busca e extração com expressão regular.
	    - _Parse_ e _dump_ de XML com Apache Commons Lang.
	.. Manipulação de arquivos:
	    - Ler e escrever arquivos binários com _buffered streams_.
	    - Ler e escrever arquivos de texto com Apache Commons IO.
	    - Gerenciar diretórios e arquivos (navegar, mover, etc).
	.. Threads e concorrência:
	    - Proteger variáveis compartilhadas com `synchronized`.
	    - Espera com `wait` e `notify`.
	    - Espera com `Semaphore`.
	    - Contador com `AtomicInteger`.
	    - Evitar _deadlock_.
	    - Gerenciar pool de threads.
	    - Agendar tarefas com `ScheduledExecutorService`.
	    - _Producer/Consumer_ com `BlockingQueue`.
	    - Tratamento de exceções em tarefas multi-thread.
	    - Espera assíncrona com `ListenableFuture` do Google Guava.
	.. Logging:
	    - Logar exceções com Apache Commons Logging.
	    - Redirecionar vários frameworks de log para o SLF4J.
	    - Usar os níveis corretos de log.
	    - Configurar vários appenders e rotacionar arquivos de log.
	.. Networking:
	    - Implementar um mini-chat usando sockets.
	    - Consumir serviços REST com `URLConnection`.
	    - Consumir serviços REST com Apache HTTP Components.
	
	. Design Patterns:
	.. UML:
	    - Diagrama de atividade
	    - Diagrama de classe
	    - Diagrama de sequência
	    - Diagrama de comunicação
	    - Diagrama de componentes
	.. Design Patterns
