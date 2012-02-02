/**
 * 
 */
package it.freax.fpm.util;

/**
 * @author kLeZ-hAcK
 * 
 */
public class Operator
{
	private String symbol;
	private String description;
	private int precedence;
	private GroupOperator group;

	public Operator(String symbol, String description, int precedence, GroupOperator group)
	{
		setSymbol(symbol);
		setDescription(description);
		setPrecedence(precedence);
		setGroup(group);
	}

	public String getDescription()
	{
		return description;
	}

	public GroupOperator getGroup()
	{
		return group;
	}

	public int getPrecedence()
	{
		return precedence;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	private void setGroup(GroupOperator group)
	{
		this.group = group;
	}

	private void setPrecedence(int precedence)
	{
		this.precedence = precedence;
	}

	private void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}
}
