package br.com.esec.main;

import br.com.esec.interfaces.Iterator;
import br.com.esec.repository.NameRepository;

public class IteratorPattern {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		// Percorre uma coleção de objeto sequencialmente sem saber
		// a representação de cada elemento
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
