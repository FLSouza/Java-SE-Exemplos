package br.com.esec.updowncasting;

//A classe Animal() herda de Object().
//A classe Animal() é a superclass de todas as outras que à estendem
class Animal {
	int health = 100;
}

class Mammal extends Animal {
}

class Cat extends Mammal {
}

class Dog extends Mammal {
}

public class updowncast {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.health);
		Dog d = new Dog();
		System.out.println(d.health);
		
		//Upcast
		Cat cat = new Cat();
		System.out.println(c);
		Mammal m = cat; // upcasting
		System.out.println(m);
		
		//Downcast
		Cat c1 = new Cat();
		Animal a = c1; // Upcasting automático para Animal
		Cat c2 = (Cat) a;// Downcasting manual para Cat 

		
		
	}
}