package br.com.esec.generics;

import java.util.ArrayList;
import java.util.List;

// Em Generics, collections de um tipo não são polimórficas no tipo
public class GenericsPolymorhism {
	public static void main( String[] args) {
        // Criamos uma lista de objetos Cachorro
        List<Dog> cachorros = new ArrayList<Dog>();

        // Quando adicionamos um cachorro não temos problema
        cachorros.add( new Dog() );

        // A linha a seguir vai resultar em erro
        //List<Object> objs = cachorros;

        // Se a linha anterior fosse permitida, poderiamos adicionar 
        // um gato com na linha a seguir e teriamos um gato numa lista de cachorros.
        //objs.add( new Cat() );
    }
}

class Cachorro {
	
}

class Gato {
	
}

