package com.hardik.spring;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Spring SPEL Ternary Operator Example.
 *
 * author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		// Create a parser with default settings.
		ExpressionParser parser = new SpelExpressionParser();

		// Ternary operator expressions.
		System.out.println(parser.parseExpression("10 < 20? true: false").getValue());
	}

}
