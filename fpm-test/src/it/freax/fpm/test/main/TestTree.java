/**
 * 
 */
package it.freax.fpm.test.main;

import it.freax.fpm.util.EbnfReader;
import it.freax.fpm.util.ErrorHandler;
import it.freax.fpm.util.Streams;

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author kLeZ-hAcK
 * 
 */
public class TestTree
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Streams str = Streams.getOne("conf/java.ebnf");
		try
		{
			InputStream is = str.getResource();
			if (is != null)
			{
				String content = str.read();
				EbnfReader reader = new EbnfReader(content);
				reader.buildMap();
				System.out.println(reader.getMap());
				// reader.buildTree();
				// System.out.println(reader.getTree());
			}
		}
		catch (FileNotFoundException e)
		{
			ErrorHandler.getOne(TestTree.class).handle(e);
		}
	}
}
