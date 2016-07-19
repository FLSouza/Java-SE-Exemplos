package br.com.esec.estudo.main;

import java.io.IOException;
import java.net.SocketException;

class A {
	public void foo() throws IOException {
	}
}

class B extends A {
	// É permitido. SocketException estende IOException
	// É definido como covariante.
	@Override
	public void foo() throws SocketException {
	
	} 
	
	// Não é permitido. SQLException não estende IOException.
	// É definido como contravariante.
/*
	@Override
	public void foo() throws SQLException {
	} 
*/
}