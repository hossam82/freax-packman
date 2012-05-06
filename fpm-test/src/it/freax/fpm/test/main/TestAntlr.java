/**
 * 
 */
package it.freax.fpm.test.main;

import it.freax.fpm.test.main.JavaParser.compilationUnit_return;
import it.freax.fpm.test.main.PhpParser.prog_return;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 * @author kLeZ-hAcK
 */
public class TestAntlr
{
	/**
	 * @param args
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public static void main(String[] args)
	{
		try
		{
			//printTree(runJavaParser());
			printTree(runPhpParser());
		}
		catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	static RunParserReturn runPhpParser() throws IOException, RecognitionException
	{
		CharStream c = new ANTLRFileStream("/usr/share/cacti/install/index.php");

		// create the lexer attached to stdin
		Lexer lexer = new PhpLexer(c);

		// create the buffer of tokens between the lexer and parser
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create the parser attached to the token buffer
		// and tell it which debug event listener to use
		PhpParser parser = new PhpParser(tokens);

		// Get the compilation unit item
		prog_return ret = parser.prog();

		CommonTree tree = (CommonTree) ret.getTree();
		return new RunParserReturn(PhpParser.RequireOperator, PhpParser.SemiColon, tree);
	}

	static RunParserReturn runJavaParser() throws RecognitionException, IOException
	{
		CharStream c = new ANTLRFileStream("/home/kLeZ-hAcK/projects/FreaxPackageManager/fpm-test/src/it/freax/fpm/test/main/MainClass.java");

		// create the lexer attached to stdin
		Lexer lexer = new JavaLexer(c);

		// create the buffer of tokens between the lexer and parser
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create the parser attached to the token buffer
		// and tell it which debug event listener to use
		JavaParser parser = new JavaParser(tokens);

		// Get the compilation unit item
		compilationUnit_return ret = parser.compilationUnit();

		// Get the associated tree
		CommonTree tree = (CommonTree) ret.getTree();
		return new RunParserReturn(JavaParser.IMPORT, JavaParser.SEMI, tree);
	}

	static void printTree(RunParserReturn ret)
	{
		ArrayList<String> imports = getImports(ret.getTree(), ret.getImportStmt(), ret.getEos());
		System.out.println("----------------------------------------------------");
		for (String _import : imports)
		{
			System.out.println(_import);
		}
	}

	static ArrayList<String> getImports(CommonTree t, int importStmt, int eos)
	{
		ArrayList<String> ret = new ArrayList<String>();
		if (t != null)
		{
			for (int i = 0; i < t.getChildCount(); i++)
			{
				if (t.getChild(i).getType() == importStmt)
				{
					System.out.print(t.getChild(i));
					System.out.print(" ");
					int j = i + 1;
					StringBuilder sb = new StringBuilder();
					String current;
					Tree child = t.getChild(j);
					while ((child != null) && (child.getType() != eos))
					{
						current = child.toString();
						sb.append(current);
						System.out.print(current);
						child = t.getChild(++j);
					}
					ret.add(sb.toString());
					System.out.println(child);
				}
			}
		}
		return ret;
	}

	private static class RunParserReturn
	{
		private int importStmt;
		private int eos;
		private CommonTree tree;

		public RunParserReturn(int importStmt, int eos, CommonTree tree)
		{
			this.importStmt = importStmt;
			this.eos = eos;
			this.tree = tree;
		}

		public int getImportStmt()
		{
			return importStmt;
		}

		public int getEos()
		{
			return eos;
		}

		public CommonTree getTree()
		{
			return tree;
		}
	}
}
