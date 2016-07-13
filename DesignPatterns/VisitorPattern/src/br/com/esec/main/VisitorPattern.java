package br.com.esec.main;

import br.com.esec.interfaces.ComputerPart;
import br.com.esec.parts.Computer;
import br.com.esec.visitor.ComputerPartDisplayVisitor;

public class VisitorPattern {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
