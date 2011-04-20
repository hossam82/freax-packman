package it.freax.fpm.core.types;

import it.freax.fpm.core.solver.conf.MethodParams;

public enum MethodType
{
	Split, KeyValue;

	public static MethodType getMethodType(String method)
	{
		MethodType ret = null;
		if (method.startsWith("Split"))
		{
			ret = Split;
		}
		else if (method.startsWith("KeyValue"))
		{
			ret = KeyValue;
		}
		return ret;
	}

	public MethodParams getParams(String method)
	{
		int start = 0, stop = 0;
		start = method.indexOf('(') + 1;
		stop = method.indexOf(')') - 1;
		String[] split = method.substring(start, stop).split(",", 3);
		String s = split[0];
		int i = Integer.parseInt(split[1]);
		MethodParams ret = new MethodParams(this, s, i);
		if (this == Split)
		{
			ret.setExtension(Boolean.parseBoolean(split[2]));
		}
		return ret;
	}
}
