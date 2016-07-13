package br.com.esec.main;

import br.com.esec.expressions.AndExpression;
import br.com.esec.expressions.OrExpression;
import br.com.esec.expressions.TerminalExpression;
import br.com.esec.interfaces.Expression;
// Regras são criadas com a interafce Expression().
// Dessa maneira é feita o parsing.
public class InterpreterPattern {
	// Regra: Robert and John are male
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// Regra: Julie is a married women
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}
}
