package br.com.esec.interfaces;

import br.com.esec.parts.Computer;
import br.com.esec.parts.Keyboard;
import br.com.esec.parts.Monitor;
import br.com.esec.parts.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}