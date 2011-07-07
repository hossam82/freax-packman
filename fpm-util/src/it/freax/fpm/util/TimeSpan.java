package it.freax.fpm.util;

import java.util.Date;

public class TimeSpan
{
	private long millis_span = 0;

	public static final long SECOND_SPAN = 1000;
	public static final long MINUTE_SPAN = SECOND_SPAN * 60;
	public static final long HOUR_SPAN = MINUTE_SPAN * 60;

	public static final int HOUR = 0;
	public static final int MINUTE = 1;
	public static final int SECOND = 2;
	public static final int MILLISECOND = 3;

	public TimeSpan(long span, int type)
	{
		switch (type)
		{
			default:
			case MILLISECOND:
			{
				millis_span = span;
				break;
			}
			case SECOND:
			{
				millis_span = span * SECOND_SPAN;
				break;
			}
			case MINUTE:
			{
				millis_span = span * MINUTE_SPAN;
				break;
			}
			case HOUR:
			{
				millis_span = span * HOUR_SPAN;
				break;
			}
		}
	}

	public TimeSpan(Date d1, Date d2)
	{
		long l1 = d1.getTime();
		long l2 = d2.getTime();
		if (l1 > l2)
		{
			millis_span = l1 - l2;
		}
		else if (l2 > l1)
		{
			millis_span = l2 - l1;
		}
		else
		{
			millis_span = 0;
		}
	}

	public long getPart(int type)
	{
		return getPart(type, true);
	}

	public long getPart(int type, boolean mod)
	{
		long ret = 0L;
		int nmod = 1;
		switch (type)
		{
			case MILLISECOND:
			{
				ret = millis_span;
				nmod = 1000;
				break;
			}
			case SECOND:
			{
				ret = millis_span / SECOND_SPAN;
				nmod = 60;
				break;
			}
			case MINUTE:
			{
				ret = millis_span / MINUTE_SPAN;
				nmod = 60;
				break;
			}
			case HOUR:
			{
				ret = millis_span / HOUR_SPAN;
				// nmod = 24;
				break;
			}
		}
		ret = (mod ? ret % nmod : ret);
		return ret;
	}

	public String format()
	{
		String ret = "";
		if (millis_span >= HOUR_SPAN)
		{
			ret = String.format("%02d:%02d:%02d.%03d (hh:mm:ss.ms)", getPart(HOUR), getPart(MINUTE), getPart(SECOND), getPart(MILLISECOND));
		}
		else if (millis_span >= MINUTE_SPAN)
		{
			ret = String.format("%02d:%02d.%03d (mm:ss.ms)", getPart(MINUTE), getPart(SECOND), getPart(MILLISECOND));
		}
		else if (millis_span >= SECOND_SPAN)
		{
			ret = String.format("%02d.%03d (ss.ms)", getPart(SECOND), getPart(MILLISECOND));
		}
		else
		{
			ret = String.format("%03d (ms)", getPart(MILLISECOND));
		}
		return ret;
	}

	public static String format(long span, int type)
	{
		return new TimeSpan(span, type).format();
	}
}
