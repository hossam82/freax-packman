package goldengine.java;

import java.util.Vector;

/*
 * Licensed Material - Property of Matthew Hawkins (hawkini@barclays.net)
 *
 * GOLDParser - code ported from VB - Author Devin Cook. All rights reserved.
 *
 * No modifications to this code are allowed without the permission of the author.
 */
/**
 * ----------------------------------------------------------------------------
 * ---------------<br>
 * Source File: LRActionTable.java<br>
 * Author: Devin Cook, Matthew Hawkins<br>
 * Description: The table of LALR Actions associated with this grammar.<br>
 * ----------------------------------------------------------------------------
 * ---------------<br>
 * Revision List<br>
 * 
 * <pre>
 *      Author          Version         Description
 *      ------          -------         -----------
 *      MPH             1.0             First Issue
 * </pre>
 * 
 * <br>
 * ----------------------------------------------------------------------------
 * ---------------<br>
 * IMPORT: java.util<br>
 * ----------------------------------------------------------------------------
 * ---------------<br>
 */
public class LRActionTable
{
	private Vector<LRAction> memberList = new Vector<LRAction>(); // LRAction
	private int memberCount = 0;

	/***************************************************************
	 * actionIndexForSymbol
	 * This method will return the index in the symbol table for the
	 * symbol in the action table specified by <code>symbolIndex</code>.
	 * 
	 * @param symbolIndex
	 *            The index in the action table of the Symbol
	 * @return The index in the Symbol Table of the Symbol specified.
	 ***************************************************************/
	public int actionIndexForSymbol(int symbolIndex)
	{
		int n = 0;
		boolean found = false;
		int index = -1;

		while (!found & (n < memberCount))
		{
			LRAction lar = memberList.elementAt(n);
			if (lar.getSymbol().getTableIndex() == symbolIndex)
			{
				index = n;
				found = true;
			}
			n++;
		}

		if (found)
		{
			return index;
		}
		else
		{
			return -1;
		}
	}

	/***************************************************************
	 * addItem
	 * This method will add a symbol to the action table. It will
	 * create a new LRAction, set its value and actionConstant,
	 * and then increment the member count after adding it.
	 * 
	 * @param theSym
	 *            The symbol in the LRAction.
	 * @param theActionConstant
	 *            The action constant of the LRAction.
	 * @param theValue
	 *            The value of the LRAction.
	 ***************************************************************/
	public void addItem(Symbol theSym, int theActionConstant, int theValue)
	{
		LRAction tableEntry = new LRAction();
		tableEntry.setSymbol(theSym);

		tableEntry.actionConstant = theActionConstant;
		tableEntry.value = theValue;

		memberCount++;
		memberList.addElement(tableEntry);
	}

	/***************************************************************
	 * count
	 * <Method Description>
	 * 
	 * @return <Return description>
	 ***************************************************************/
	public int count()
	{
		return memberCount;
	}

	/***************************************************************
	 * item
	 * This method will return the LRAction at the specified index.
	 * It will only return if and only if the index is a valid number.
	 * 
	 * @param n
	 *            The index in the LRActionTable to look at.
	 * @return The LRAction at the specified index.
	 ***************************************************************/
	public LRAction item(int n)
	{
		if ((n >= 0) & (n < memberCount)) { return memberList.elementAt(n); }

		return null;
	}
}
