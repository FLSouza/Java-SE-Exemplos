package br.com.esec.parts;

import br.com.esec.interfaces.ComputerPart;
import br.com.esec.interfaces.ComputerPartVisitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}