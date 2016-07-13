package br.com.esec.visitor;

import br.com.esec.interfaces.ComputerPartVisitor;
import br.com.esec.parts.Computer;
import br.com.esec.parts.Keyboard;
import br.com.esec.parts.Monitor;
import br.com.esec.parts.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}
}