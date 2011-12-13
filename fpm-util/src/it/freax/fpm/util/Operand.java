/**
 * 
 */
package it.freax.fpm.util;

/**
 * @author kLeZ-hAcK
 * 
 */
public class Operand
{
	/*-
	 * Definizione di Operando:
	 * Un operando è un simbolo che identifica un elemento di una espressione.
	 * 
	 * I tipi di operando sono almeno 4:
	 * - Numeri (Interi o Decimali)
	 * - Lettere (Usate come variabili)
	 * - Parentesi (Usati come elementi di raggruppamento per forzare la precedenza)
	 * - Operatori aritmetici logici (Ben definiti come < > = ! & | + - * / ^ ~ #; [gli ultimi due sono arrotondamento {va espresso con un secondo operatore - + per difetto o eccesso} e radice])
	 * 
	 * Espressione tipica del concetto:
	 * 12*4/(45+8-7/9*[(18#{3*129#5})~+])
	 * 
	 */

	private Object operand;
	private boolean isOperator;

	public Operand(Object operand)
	{
		setOperand(operand);
		setOperator(getOperand() instanceof Operator);
	}

	private void setOperand(Object operand)
	{
		this.operand = operand;
	}

	public Object getOperand()
	{
		return operand;
	}

	public void setOperator(boolean isOperator)
	{
		this.isOperator = isOperator;
	}

	public boolean isOperator()
	{
		return isOperator;
	}
}
