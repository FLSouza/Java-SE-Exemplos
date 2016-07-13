package br.com.esec.semaphore;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class SamaphoreMutex {

	static Object lock = new Object();
	static LinkedList<String> list = new LinkedList<String>();

	// Semaphore mantêm um certo número de permissões. Sempre que alguém 
	// tenta adquirir uma permissão, é bloqueado até que tenha uma permissão disponível.
	static Semaphore semaphore = new Semaphore(0);
	static Semaphore mutex = new Semaphore(1);

	// Irá produzir um inteiro todas as vezes.
	static class Producer extends Thread {
		public void run() {

			int counter = 1;
			try {
				while (true) {
					String threadName = Thread.currentThread().getName() + counter++;

					mutex.acquire();
					list.add(threadName);
					System.out.println("Producer is prdoucing new value: " + threadName);
					mutex.release();

					// release lock
					semaphore.release();
					Thread.sleep(500);
				}
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
	}

	// Irá consumir um inteiro todas as vezes.
	static class Consumer extends Thread {
		String consumerName;

		public Consumer(String name) {
			this.consumerName = name;
		}

		public void run() {
			try {

				while (true) {

					// Adquire o lock. Adquire todos as permissões disponíveis nesse semaphore, 
					// bloqueando enquanto todas não estão disponíveis. 
					// O processo para aqui antes de liberar o lock.
					semaphore.acquire();
					
					// Adquire uma permissão deste semaphore, bloqueando antes que algum esteja disponível.

					mutex.acquire();
					String result = "";
					for (String value : list) {
						result = value + ",";
					}
					System.out.println(consumerName + " consumes value: " + result + "list.size(): "
							+ list.size() + "\n");
					mutex.release();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Producer().start();
		new Consumer("Apple").start();
		new Consumer("Google").start();
		new Consumer("Yahoo").start();
	}
}
