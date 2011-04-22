package it.freax.fpm.core.types;

import it.freax.fpm.core.solver.conf.MethodParams;
import it.freax.fpm.core.util.StringUtils;

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
		String mp = StringUtils.getStringInsideDelimiters(method, "(", ")");
		String[] split = mp.split(",", 3);
		String s = StringUtils.getStringInsideDelimiters(split[0], "'", "'");
		MethodParams ret = new MethodParams(this, s);
		if (this == Split)
		{
			ret.setIndex(Integer.parseInt(split[1]));
			ret.setExtension(Boolean.parseBoolean(split[2]));
		}
		return ret;
	}
}
