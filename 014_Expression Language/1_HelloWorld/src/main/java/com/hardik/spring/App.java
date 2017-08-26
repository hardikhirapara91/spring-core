package com.hardik.spring;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Spring SPEL "Hello World" example.
 *
 * author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		// Create a parser with default settings.
		ExpressionParser parser = new SpelExpressionParser();

		// Parse the expression string and return an Expression object
		// which can be used for repeated evaluation.
		Expression exp = parser.parseExpression("'Hello World!'");

		// Evaluate this expression and returns the result.
		String message = (String) exp.getValue();

		// Print result.
		System.out.println(message);
	}

}
