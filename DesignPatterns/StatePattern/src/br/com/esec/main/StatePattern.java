package br.com.esec.main;

import br.com.esec.state.Context;
import br.com.esec.state.StartState;
import br.com.esec.state.StopState;

public class StatePattern {

	// Nesse exemplo Context() vai alterar o comportamento
	// baseado no estado em que a classe se encotra.
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}
