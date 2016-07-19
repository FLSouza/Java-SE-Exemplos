package br.com.esec.listenableFuture;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		runListenableFutureDemo();
	}

	private static void runListenableFutureDemo() {
		System.out.println(LocalTime.now() + " Hello future!");

		final ListenableFutureExample demo = new ListenableFutureExample();

		// Cria o executor service que irá enviar todas as future tasks
		ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));

		// Executa non-blocking task
		ListenableFuture<String> listenableFuture = service.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return demo.executeLongRunningTask();
			}
		});

		// Adiciona callback de sucesso ou falha ao listenableFuture object
		Futures.addCallback(listenableFuture, new FutureCallback<String>() {
			@Override
			public void onSuccess(String result) {
				System.out.println(LocalTime.now() + " Tarefa completada com sucesso e resultado: " + result);
			}

			@Override
			public void onFailure(Throwable t) {
				System.out.println(LocalTime.now() + " A tarefa falhou com resultado: " + t.getMessage());
			}
		});

		System.out.println(
				LocalTime.now() + " O método Main está completo mas o resultado ainda está sendo calculado...");
	}

}
