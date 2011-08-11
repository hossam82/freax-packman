package it.freax.fpm.parser.expreval;

import java.math.BigDecimal;
import java.math.MathContext;

enum Operator
{
	/**
	 * End of string reached.
	 */
	END(-1, 0, null, null, null)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			throw new RuntimeException("END is a dummy operation");
		}
	},
	/**
	 * condition ? (expression if true) : (expression if false)
	 */
	TERNARY(0, 3, "?", null, null)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return (value1.signum() != 0) ? value2 : value3;
		}
	},
	/**
	 * &amp;&amp;
	 */
	AND(0, 2, "&&", Type.BOOLEAN, Type.BOOLEAN)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return (value1.signum() != 0) && (value2.signum() != 0) ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * ||
	 */
	OR(0, 2, "||", Type.BOOLEAN, Type.BOOLEAN)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return (value1.signum() != 0) || (value2.signum() != 0) ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * &gt;
	 */
	GT(1, 2, ">", Type.BOOLEAN, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.compareTo(value2) > 0 ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * &gt;=
	 */
	GE(1, 2, ">=", Type.BOOLEAN, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.compareTo(value2) >= 0 ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * &lt;
	 */
	LT(1, 2, "<", Type.BOOLEAN, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.compareTo(value2) < 0 ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * &lt;=
	 */
	LE(1, 2, "<=", Type.BOOLEAN, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.compareTo(value2) <= 0 ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * ==
	 */
	EQ(1, 2, "==", Type.BOOLEAN, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.compareTo(value2) == 0 ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * != or &lt;&gt;
	 */
	NE(1, 2, "!=", Type.BOOLEAN, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.compareTo(value2) != 0 ? BigDecimal.ONE
					: BigDecimal.ZERO;
		}
	},
	/**
	 * +
	 */
	ADD(2, 2, "+", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.add(value2);
		}
	},
	/**
	 * -
	 */
	SUB(2, 2, "-", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.subtract(value2);
		}
	},
	/**
	 * /
	 */
	DIV(3, 2, "/", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.divide(value2, MathContext.DECIMAL128);
		}
	},
	/**
	 * %
	 */
	REMAINDER(3, 2, "%", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.remainder(value2, MathContext.DECIMAL128);
		}
	},
	/**
	 * *
	 */
	MUL(3, 2, "*", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.multiply(value2);
		}
	},
	/**
	 * -negate
	 */
	NEG(4, 1, "-", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.negate();
		}
	},
	/**
	 * +plus
	 */
	PLUS(4, 1, "+", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1;
		}
	},
	/**
	 * abs
	 */
	ABS(4, 1, " abs ", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1.abs();
		}
	},
	/**
	 * pow
	 */
	POW(4, 2, " pow ", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			try
			{
				return value1.pow(value2.intValueExact());
			} catch (ArithmeticException ae)
			{
				throw new RuntimeException("pow argument: " + ae.getMessage());
			}
		}
	},
	/**
	 * int
	 */
	INT(4, 1, "int ", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return new BigDecimal(value1.toBigInteger());
		}
	},
	/**
	 * No operation - used internally when expression contains only a reference
	 * to a variable.
	 */
	NOP(4, 1, "", Type.ARITHMETIC, Type.ARITHMETIC)
	{
		@Override
		BigDecimal perform(BigDecimal value1, BigDecimal value2,
				BigDecimal value3)
		{
			return value1;
		}
	};

	final int precedence;
	final int numberOfOperands;
	final String string;
	final Type resultType;
	final Type operandType;

	Operator(final int precedence, final int numberOfOperands,
			final String string, final Type resultType, final Type operandType)
	{
		this.precedence = precedence;
		this.numberOfOperands = numberOfOperands;
		this.string = string;
		this.resultType = resultType;
		this.operandType = operandType;
	}

	abstract BigDecimal perform(BigDecimal value1, BigDecimal value2,
			BigDecimal value3);
}
