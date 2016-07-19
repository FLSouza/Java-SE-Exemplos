package br.com.esec.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	public static void main(String[] args) throws Exception {

		// Cira a BlockingQueue de tamanho 10
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		// Inicia o produces para inserir messages na queue
		// starting producer to produce messages in queue
		new Thread(producer).start();
		
		// Inicia consumer para consumir menssages da queue
		new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");
	}
}
