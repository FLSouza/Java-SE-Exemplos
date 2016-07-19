package br.com.esec.composite;

import br.com.esec.interfaces.Employee;

public class Developer implements Employee {

	private String name;
	private double salary;

	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void add(Employee employee) {
		// Este método não se aplica a essa classe.
	}

	public Employee getChild(int i) {
		// Este método não se aplica a essa classe.
		return null;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("-------------");
	}

	public void remove(Employee employee) {
		// Este método não se aplica a essa classe.
	}

}