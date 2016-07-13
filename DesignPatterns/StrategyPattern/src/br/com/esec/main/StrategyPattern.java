package br.com.esec.main;

import br.com.esec.operations.Context;
import br.com.esec.operations.OperationAdd;
import br.com.esec.operations.OperationMultiply;
import br.com.esec.operations.OperationSubstract;

public class StrategyPattern {
	public static void main(String[] args) {
		// Nesse caso o comportamento de Context() irá mudar de 
		// acordo com a strategy que ela executa.
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
