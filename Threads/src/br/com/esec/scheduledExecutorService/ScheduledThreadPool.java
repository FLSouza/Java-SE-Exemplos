package br.com.esec.scheduledExecutorService;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

		// Programado para ser executado depois de algum tempo.
		System.out.println("Tempo atual = " + new Date());
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			WorkerThread worker = new WorkerThread("faz o trabalho pesado");
			scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
		}

		// Aqui é adicionado um delay para permitir algumas threads
		// sejam geradas pelo scheduler.
		Thread.sleep(30000);

		scheduledThreadPool.shutdown();
		//Espera todas as tarefas terminarem.
		while (!scheduledThreadPool.isTerminated()) {

		}
		System.out.println("Terminou todas a threads!");
	}

}
