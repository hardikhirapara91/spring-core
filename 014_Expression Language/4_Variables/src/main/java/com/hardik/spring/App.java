package com.hardik.spring;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Spring SPEL Ternary Operator Example.
 *
 * author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		MulitplicationTest test = new MulitplicationTest();

		// Create StandardEvaluationContext object
		EvaluationContext context = new StandardEvaluationContext(test);

		// Create a parser with default settings.
		ExpressionParser parser = new SpelExpressionParser();

		// Set variables values.
		parser.parseExpression("no1").setValue(context, 123);
		parser.parseExpression("no2").setValue(context, 345);

		test.multiplication();
	}

}
