package it.freax.fpm.parser.expreval;

import java.math.BigDecimal;

final class Tokeniser
{
	static final Character START_NEW_EXPRESSION = new Character('(');

	private final String string;
	private int position;
	private Operator pushedBackOperator = null;

	Tokeniser(String string)
	{
		this.string = string;
		position = 0;
	}

	int getPosition()
	{
		return position;
	}

	void setPosition(int position)
	{
		this.position = position;
	}

	void pushBack(Operator operator)
	{
		pushedBackOperator = operator;
	}

	Operator getOperator(char endOfExpressionChar)
	{
		/* Use any pushed back operator. */
		if (pushedBackOperator != null)
		{
			Operator operator = pushedBackOperator;
			pushedBackOperator = null;
			return operator;
		}

		/* Skip whitespace */
		final int len = string.length();
		char ch = 0;
		while ((position < len)
				&& Character.isWhitespace(ch = string.charAt(position)))
		{
			position++;
		}
		if (position == len)
		{
			if (endOfExpressionChar == 0)
			{
				return Operator.END;
			} else
			{
				throw new RuntimeException("missing " + endOfExpressionChar);
			}
		}

		position++;
		if (ch == endOfExpressionChar)
		{
			return Operator.END;
		}

		switch (ch)
		{
		case '+':
		{
			return Operator.ADD;
		}
		case '-':
		{
			return Operator.SUB;
		}
		case '/':
		{
			return Operator.DIV;
		}
		case '%':
		{
			return Operator.REMAINDER;
		}
		case '*':
		{
			return Operator.MUL;
		}
		case '?':
		{
			return Operator.TERNARY;
		}
		case '>':
		{
			if ((position < len) && (string.charAt(position) == '='))
			{
				position++;
				return Operator.GE;
			}
			return Operator.GT;
		}
		case '<':
		{
			if (position < len)
			{
				switch (string.charAt(position))
				{
				case '=':
					position++;
					return Operator.LE;
				case '>':
					position++;
					return Operator.NE;
				}
			}
			return Operator.LT;
		}
		case '=':
		{
			if ((position < len) && (string.charAt(position) == '='))
			{
				position++;
				return Operator.EQ;
			}
			throw new RuntimeException("use == for equality at position "
					+ position);
		}
		case '!':
		{
			if ((position < len) && (string.charAt(position) == '='))
			{
				position++;
				return Operator.NE;
			}
			throw new RuntimeException(
					"use != or <> for inequality at position " + position);
		}
		case '&':
		{
			if ((position < len) && (string.charAt(position) == '&'))
			{
				position++;
				return Operator.AND;
			}
			throw new RuntimeException("use && for AND at position " + position);
		}
		case '|':
		{
			if ((position < len) && (string.charAt(position) == '|'))
			{
				position++;
				return Operator.OR;
			}
			throw new RuntimeException("use || for OR at position " + position);
		}
		default:
		{
			/* Is this an identifier name for an operator function? */
			if (Character.isUnicodeIdentifierStart(ch))
			{
				int start = position - 1;
				while ((position < len)
						&& Character.isUnicodeIdentifierPart(string
								.charAt(position)))
				{
					position++;
				}

				String name = string.substring(start, position);
				if (name.equals("pow"))
				{
					return Operator.POW;
				}
			}
			throw new RuntimeException("operator expected at position "
					+ position + " instead of '" + ch + "'");
		}
		}
	}

	/**
	 * Called when an operand is expected next.
	 * 
	 * @return one of:
	 *         <UL>
	 *         <LI>a {@link BigDecimal} value;</LI>
	 *         <LI>the {@link String} name of a variable;</LI>
	 *         <LI>{@link Tokeniser#START_NEW_EXPRESSION} when an opening
	 *         parenthesis is found:</LI>
	 *         <LI>or {@link Operator} when a unary operator is found in front
	 *         of an operand</LI>
	 *         </UL>
	 * 
	 * @throws RuntimeException
	 *             if the end of the string is reached unexpectedly.
	 */
	Object getOperand()
	{
		/* Skip whitespace */
		final int len = string.length();
		char ch = 0;
		while ((position < len)
				&& Character.isWhitespace(ch = string.charAt(position)))
		{
			position++;
		}
		if (position == len)
		{
			throw new RuntimeException(
					"operand expected but end of string found");
		}

		if (ch == '(')
		{
			position++;
			return START_NEW_EXPRESSION;
		} else if (ch == '-')
		{
			position++;
			return Operator.NEG;
		} else if (ch == '+')
		{
			position++;
			return Operator.PLUS;
		} else if ((ch == '.') || Character.isDigit(ch))
		{
			return getBigDecimal();
		} else if (Character.isUnicodeIdentifierStart(ch))
		{
			int start = position++;
			while ((position < len)
					&& Character.isUnicodeIdentifierPart(string
							.charAt(position)))
			{
				position++;
			}

			String name = string.substring(start, position);
			/* Is variable name actually a keyword unary operator? */
			if (name.equals("abs"))
			{
				return Operator.ABS;
			} else if (name.equals("int"))
			{
				return Operator.INT;
			}
			/* Return variable name */
			return name;
		}
		throw new RuntimeException("operand expected but '" + ch + "' found");
	}

	private BigDecimal getBigDecimal()
	{
		final int len = string.length();
		final int start = position;
		char ch;

		while ((position < len)
				&& (Character.isDigit(ch = string.charAt(position)) || (ch == '.')))
		{
			position++;
		}

		/* Optional exponent part including another sign character. */
		if ((position < len)
				&& (((ch = string.charAt(position)) == 'E') || (ch == 'e')))
		{
			position++;
			if ((position < len)
					&& (((ch = string.charAt(position)) == '+') || (ch == '-')))
			{
				position++;
			}
			while ((position < len)
					&& Character.isDigit(ch = string.charAt(position))

			)
			{
				position++;
			}
		}
		return new BigDecimal(string.substring(start, position));
	}

	@Override
	public String toString()
	{
		return string.substring(0, position) + ">>>"
				+ string.substring(position);
	}
}
