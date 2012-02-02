package it.freax.fpm.util;

public class Expression
{
	// Operatori aritmetici logici (Ben definiti come < > = ! & | + - * / ^ ~ #;
	// [gli ultimi due sono arrotondamento {va espresso con un secondo operatore
	// - + per difetto o eccesso} e radice])
	public static final Operator[] OPERATORS = new Operator[] { new Operator("+", "Plus", 0, GroupOperator.NoGroup), new Operator("-", "Minus", 0, GroupOperator.NoGroup), new Operator("*", "Multiplier", 1, GroupOperator.NoGroup), new Operator("/", "Divider", 1, GroupOperator.NoGroup), new Operator("^", "Power", 2, GroupOperator.NoGroup), new Operator("#", "Root", 2, GroupOperator.NoGroup), new Operator("~+", "Round Positive", -1, GroupOperator.NoGroup), new Operator("~-", "Round Negative", -1, GroupOperator.NoGroup), new Operator("<", "Lesser", -1, GroupOperator.NoGroup), new Operator("<=", "Lesser Equals", -1, GroupOperator.NoGroup), new Operator(">", "Greater", -1, GroupOperator.NoGroup), new Operator(">=", "Greater Equals", -1, GroupOperator.NoGroup), new Operator("=", "Equals", -1, GroupOperator.NoGroup), new Operator("!", "Not", -1, GroupOperator.NoGroup), new Operator("!=", "Not Equals", -1, GroupOperator.NoGroup), new Operator("&", "And", -1, GroupOperator.NoGroup), new Operator("|", "Or", -1, GroupOperator.NoGroup), new Operator("(", "Open Round Group", -2, GroupOperator.GroupStart), new Operator(")", "Closed Round Group", -2, GroupOperator.GroupEnd), new Operator("[", "Open Square Group", -2, GroupOperator.GroupStart), new Operator("]", "Closed Square Group", -2, GroupOperator.GroupEnd), new Operator("{", "Open Bracket", -2, GroupOperator.GroupStart), new Operator("}", "Closed Bracket", -2, GroupOperator.GroupEnd) };

	private String expr;

	public Expression(String expr)
	{
		this.expr = expr;
	}

	public String getExpression()
	{
		return expr;
	}
}
