package com.hardik.spring;

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

		// Arithmetic operator expressions.
		System.out.println("10*20 = " + parser.parseExpression("10*20").getValue());
		System.out.println("Today's date: " + parser.parseExpression("new java.util.Date()").getValue());

		// Relational operator expressions.
		System.out.println("10==20: " + parser.parseExpression("10==20").getValue());

		// Logical operator expressions.
		System.out.println(parser.parseExpression("(10 > 5) and (5>3)").getValue());
	}

}
