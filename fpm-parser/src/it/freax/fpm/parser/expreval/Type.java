package it.freax.fpm.parser.expreval;

enum Type
{
	ARITHMETIC("arithmetic"), BOOLEAN("boolean");

	final String name;

	Type(String name)
	{
		this.name = name;
	}
}
