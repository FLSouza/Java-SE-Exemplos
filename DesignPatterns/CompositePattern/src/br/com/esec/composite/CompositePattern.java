package br.com.esec.composite;

import br.com.esec.interfaces.Employee;

public class CompositePattern {
	// Nesse exemplo são 5 employees. Serão impressos nome e salário
	// de todos os employees de cima para baixo.
	public static void main(String[] args) {
		Employee emp1 = new Developer("John", 10000);
		Employee emp2 = new Developer("David", 15000);
		Employee manager1 = new Manager("Daniel", 25000);
		manager1.add(emp1);
		manager1.add(emp2);
		Employee emp3 = new Developer("Michael", 20000);
		Manager generalManager = new Manager("Mark", 50000);
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
	}

}
