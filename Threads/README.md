# Threads

- Java suporta Threads nativamente.
- A JVM decide a ordem de execução das Threads.
- Java mapeia os Threads para o sistema operacional.

- Green Threads - emulam um ambiente multi-threaded sem depender da capacidade do sistema operacional

# ScheduledExecutorService

É um ExecutorService que pode ser programado para executar tarefas com um delay, ou pode ser executado repetidamente com um intervalo fixo entre cada execução. As execuções são feitas de forma assíncrona por uma worker thead e não pela thread que está lidando com a tarefa da ScheduledExecutorService.

# BlockingQueue

Representa uma **queue** em que uma thread produz novos objetos que são inseridos na **queue** até que a seja atingido o limite permitido. Se o limite for atingindo a thread de produção é bloqueada e continuar até que uma thread que consome retire um objeto da **queue**. A thread que consome retirar e processa os objetos da **queue**, quando não possuirem mais objetos para serem consumidos, a a thread que consome é bloqueada até que a thread que produz insiria mais objetos na **queue**.

# ListenableFuture

É uma interface que faz parte da biblioteca do Google, Guava: Google Core Libraries for Java. Ela adiciona funcionalidades que a java.util.concurrent.Future, inserida no Java 5, não possui. A única maneira de recuperar o resultado contido em **Future** é chamando o método **get()**, que bloqueia caso o resultado ainda não esteja disponível, mantendo o processo síncrono. Com a interface ListenableFuture é possível inserir um callback que irá ser chamado quando o resultado estiver disponível, não sendo necessário chamar o método **get()** e por consequência bloquear a thread. Dessa maneira o processo de torna assíncrono.