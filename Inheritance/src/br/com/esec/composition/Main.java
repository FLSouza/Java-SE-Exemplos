package br.com.esec.composition;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		//O código abaixo não é afetado por nenhuma mudança que tenha no objeto Job()
		long salary = person.getSalary();
	}

}
