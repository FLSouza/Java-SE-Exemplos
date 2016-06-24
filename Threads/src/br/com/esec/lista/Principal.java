package br.com.esec.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		// Lista lista = new Lista(); <-- Lista feita na mão com synchronized
		// A classe ArrayList não thread safe.
		// List<String> lista = new ArrayList<String>(); <-- ArrayList sem thread safe
		//List<String> lista = Collections.synchronizedList(new ArrayList<String>()); <-- Adicionando thread safe ao ArrayList com a classe java.util.Collections
		List<String> lista = new Vector<String>(); //Vector também é thread safe
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}

		Thread.sleep(2000);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + " - " + lista.get(i));
		}
	}
}
