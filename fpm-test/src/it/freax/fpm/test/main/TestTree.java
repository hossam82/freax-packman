/**
 * 
 */
package it.freax.fpm.test.main;

import it.freax.fpm.compiler.ebnf.Ebnf;
import it.freax.fpm.compiler.ebnf.edo.EbnfToken;
import it.freax.fpm.util.Dictionary;
import it.freax.fpm.util.ErrorHandler;
import it.freax.fpm.util.MapEntry;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.exceptions.ParseException;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

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
				Ebnf reader = new Ebnf(content);
				reader.read();
				//				System.out.println(reader.getEbnf());
				reader.buildTokens();
				Dictionary<MapEntry<String, String>, List<EbnfToken>> tokens = reader.getTokdict();
				Iterator<MapEntry<MapEntry<String, String>, List<EbnfToken>>> it;
				it = tokens.iterator();
				while (it.hasNext())
				{
					MapEntry<MapEntry<String, String>, List<EbnfToken>> next = it.next();
					System.out.println(next);
				}
			}
		}
		catch (FileNotFoundException e)
		{
			ErrorHandler.getOne(TestTree.class).handle(e);
		}
		catch (ParseException e)
		{
			ErrorHandler.getOne(TestTree.class).handle(e);
		}
	}
}
