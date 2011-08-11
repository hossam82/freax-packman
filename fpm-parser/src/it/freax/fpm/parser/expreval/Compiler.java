package it.freax.fpm.parser.expreval;

class Compiler
{
	private final Tokeniser tokeniser;

	Compiler(String expression)
	{
		tokeniser = new Tokeniser(expression);
	}

	Operation compile()
	{
		Object expression = compile(null, null, 0, (char) 0, -1);

		/*
		 * If expression is a variable name or BigDecimal constant value then we
		 * need to put into a NOP operation.
		 */
		if (expression instanceof Operation)
		{
			return (Operation) expression;
		}
		return Operation.nopOperationfactory(expression);
	}

	private Object compile(Object preReadOperand, Operator preReadOperator,
			int nestingLevel, char endOfExpressionChar, int terminatePrecedence)
	{
		Object operand = preReadOperand != null ? preReadOperand
				: getOperand(nestingLevel);
		Operator operator = preReadOperator != null ? preReadOperator
				: tokeniser.getOperator(endOfExpressionChar);

		while (operator != Operator.END)
		{
			if (operator == Operator.TERNARY)
			{
				Object operand2 = compile(null, null, nestingLevel, ':', -1);
				Object operand3 = compile(null, null, nestingLevel,
						endOfExpressionChar, -1);
				operand = Operation.tenaryOperationFactory(operator, operand,
						operand2, operand3);
				operator = Operator.END;
			} else
			{
				Object nextOperand = getOperand(nestingLevel);
				Operator nextOperator = tokeniser
						.getOperator(endOfExpressionChar);
				if (nextOperator == Operator.END)
				{
					/* We are at the end of the expression */
					operand = Operation.binaryOperationfactory(operator,
							operand, nextOperand);
					operator = Operator.END;
					if ((preReadOperator != null) && (endOfExpressionChar != 0))
					{
						/* The bracket also terminates an earlier expression. */
						tokeniser.pushBack(Operator.END);
					}
				} else if (nextOperator.precedence <= terminatePrecedence)
				{
					/*
					 * The precedence of the following operator effectively
					 * brings this expression to an end.
					 */
					operand = Operation.binaryOperationfactory(operator,
							operand, nextOperand);
					tokeniser.pushBack(nextOperator);
					operator = Operator.END;
				} else if (operator.precedence >= nextOperator.precedence)
				{
					/* The current operator binds tighter than any following it */
					operand = Operation.binaryOperationfactory(operator,
							operand, nextOperand);
					operator = nextOperator;
				} else
				{
					/*
					 * The following operator binds tighter so compile the
					 * following expression first.
					 */
					operand = Operation.binaryOperationfactory(
							operator,
							operand,
							compile(nextOperand, nextOperator, nestingLevel,
									endOfExpressionChar, operator.precedence));
					operator = tokeniser.getOperator(endOfExpressionChar);
					if ((operator == Operator.END) && (preReadOperator != null)
							&& (endOfExpressionChar != 0))
					{
						/* The bracket also terminates an earlier expression. */
						tokeniser.pushBack(Operator.END);
					}
				}
			}
		}
		return operand;
	}

	private Object getOperand(int nestingLevel)
	{
		Object operand = tokeniser.getOperand();
		if (operand == Tokeniser.START_NEW_EXPRESSION)
		{
			operand = compile(null, null, nestingLevel + 1, ')', -1);
		} else if (operand instanceof Operator)
		{
			/* Can get unary operators when expecting operand */
			return Operation.unaryOperationfactory((Operator) operand,
					getOperand(nestingLevel));
		}
		return operand;
	}
}
