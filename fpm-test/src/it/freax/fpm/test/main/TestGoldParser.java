package it.freax.fpm.test.main;

import goldengine.java.*;

import java.util.Vector;

public class TestGoldParser
{
	public static void main(String[] args)
	{
		Vector<String> usings = new Vector<String>();
		GOLDParser parser = new GOLDParser();
		String grammar = "/home/kLeZ-hAcK/Scaricati/Gold (EBNF) Syntax Files/C# 2.0 r7.cgt";
		String srcToParse = "/home/kLeZ-hAcK/Scaricati/hawkins-java-source-v1.3/C#Sample.cs";
		try
		{
			if (parser.loadCompiledGrammar(grammar))
			{
				if (parser.openFile(srcToParse))
				{
					int out = -1, counter = 0;
					boolean done = false, goodpayload = false, usingcomplete = false;
					StringBuilder using = new StringBuilder();
					while (!done)
					{
						// System.out.print("Ciclo ");
						// System.out.print(++counter);
						// System.out.println(": ");
						out = parser.parse();
						Token myTok = parser.currentToken();
						switch (out)
						{
							case GPMessageConstants.gpMsgTokenRead:
								// System.out.println("gpMsgTokenRead");
								if (myTok.getName().equalsIgnoreCase("Identifier"))
								{
									usingcomplete = false;
									using.delete(0, using.length());
									using.append(myTok.getData());
								}
								else if (myTok.getName().equalsIgnoreCase("MemberName"))
								{
									using.append(myTok.getData());
								}
								else
								{
									usingcomplete = true;
								}
								if (usingcomplete && !usings.contains(using.toString()))
								{
									usings.add(using.toString());
								}
								// printElement(myTok);
								break;

							case GPMessageConstants.gpMsgReduction:
								// System.out.println("gpMsgReduction");
								// printElement(myTok);
								Reduction myRed = parser.currentReduction();
								Rule rule = myRed.getParentRule();
								Symbol sym = rule.getRuleNonTerminal();

								// printElement(rule);
								// printElement(sym);
								break;

							case GPMessageConstants.gpMsgAccept:
								System.out.println("gpMsgAccept");
								done = true;
								break;
							case GPMessageConstants.gpMsgLexicalError:
								System.out.println("gpMsgLexicalError");
								parser.popInputToken();
								break;

							case GPMessageConstants.gpMsgNotLoadedError:
								System.out.println("gpMsgNotLoadedError");
								done = true;
								break;

							case GPMessageConstants.gpMsgSyntaxError:
								done = true;
								Token theTok = parser.currentToken();
								System.out.println("Token not expected: " + theTok.getData().toString());
								System.out.println("gpMsgSyntaxError");
								break;

							case GPMessageConstants.gpMsgCommentError:
								System.out.println("gpMsgCommentError");
								done = true;
								break;

							case GPMessageConstants.gpMsgInternalError:
								System.out.println("gpMsgInternalError");
								done = true;
								break;
						}
					}
					parser.closeFile();
				}
				else
				{
					System.out.println("Il parser non è riuscito ad aprire il file sorgente...");
				}
			}
			else
			{
				System.out.println("Il parser non è riuscito ad aprire il file di grammatica...");
			}
		}
		catch (ParserException e)
		{
			e.printStackTrace();
		}
		for (String using : usings)
		{
			System.out.println(using);
		}
	}

	private static void printElement(Object obj)
	{
		System.out.print(obj.getClass().getSimpleName());
		System.out.print(" { ");
		Class<? extends Object> clz = obj.getClass();
		if (clz.equals(Token.class))
		{
			printToken((Token) obj);
		}
		else if (clz.equals(Rule.class))
		{
			printRule((Rule) obj);
		}
		else if (clz.equals(Symbol.class))
		{
			printSymbol((Symbol) obj);
		}
		else
		{
			System.out.print(obj);
		}
		System.out.println(" }");
	}

	private static void printSymbol(Symbol sym)
	{
		System.out.print("Name: ");
		System.out.print(sym.getName());
		System.out.print("; Text: ");
		System.out.print(sym.getText());
	}

	private static void printRule(Rule rule)
	{
		System.out.print("Name: ");
		System.out.print(rule.getName());
		System.out.print("; Text: ");
		System.out.print(rule.getText());
		System.out.print("; OneNonTerminal: ");
		System.out.print(rule.containsOneNonTerminal());
	}

	private static void printToken(Token tok)
	{
		System.out.print("Name: ");
		System.out.print(tok.getName());
		System.out.print("; Data=");
		System.out.print(tok.getData());
		System.out.print("; Symbol kind: ");
		System.out.print(tok.getPSymbol().getKind());
	}
}
