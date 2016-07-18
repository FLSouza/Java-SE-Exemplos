package br.com.esec.listenableFuture;

import java.time.LocalTime;

public class ListenableFutureExample {
	public String executeLongRunningTask() throws InterruptedException {
		System.out.println(LocalTime.now() + " Calculando tarefas de longa duração...");
		Thread.sleep(5000);
		return "O calculo terminou em: " + LocalTime.now();
	}
}
