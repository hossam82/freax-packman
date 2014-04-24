/**
 * 
 */
package it.freax.fpm.test.main;

import java.io.File;

import it.freax.fpm.core.specs.RpmSpec;

/**
 * @author klez
 */
public class TestRpm
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String path = "";
		//		path = args[0];
		path = "/home/klez/Scaricati/RPM/skype-4.2.0.11-suse.i586.rpm";
		File file = new File(path);
		RpmSpec spec = new RpmSpec(null);
		spec.Load(file);
	}

}
