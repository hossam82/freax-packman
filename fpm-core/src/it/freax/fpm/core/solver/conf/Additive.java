package it.freax.fpm.core.solver.conf;

import it.freax.fpm.core.solver.dto.SrcFile;
import it.freax.fpm.core.types.InfoType;
import it.freax.fpm.core.types.MethodType;
import it.freax.fpm.core.types.WhereToParseType;
import it.freax.fpm.core.util.EntriesScorer;
import it.freax.fpm.core.util.StringUtils;

import java.util.Vector;

public class Additive
{
	private int id;
	private InfoType infoType;
	private WhereToParseType whereToParse;
	private String whatToParse;
	private String howToParse;

	public Additive(int id, InfoType infoType, WhereToParseType whereToParse, String whatToParse, String howToParse)
	{
		this.id = id;
		this.infoType = infoType;
		this.whereToParse = whereToParse;
		this.whatToParse = whatToParse;
		this.howToParse = howToParse;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public InfoType getInfoType()
	{
		return this.infoType;
	}

	public void setInfoType(InfoType infoType)
	{
		this.infoType = infoType;
	}

	public WhereToParseType getWhereToParse()
	{
		return this.whereToParse;
	}

	public void setWhereToParse(WhereToParseType whereToParse)
	{
		this.whereToParse = whereToParse;
	}

	public String getWhatToParse()
	{
		return this.whatToParse;
	}

	public void setWhatToParse(String whatToParse)
	{
		this.whatToParse = whatToParse;
	}

	public String getHowToParse()
	{
		return this.howToParse;
	}

	public void setHowToParse(String howToParse)
	{
		this.howToParse = howToParse;
	}

	public MethodParams getMethodParams()
	{
		MethodType type = MethodType.getMethodType(this.howToParse);
		return type.getParams(this.howToParse);
	}

	public String execMethod(SrcFile file)
	{
		String ret = "";
		MethodType type = MethodType.getMethodType(this.howToParse);
		MethodParams mp = type.getParams(this.howToParse);
		String input = "";

		switch (this.whereToParse)
		{
			case Content:
			{
				input = file.getContent();
				ret = this.getValue(type, mp, input);
				break;
			}
			case FileName:
			{
				input = file.getName();
				ret = this.getValue(type, mp, input);
				break;
			}
			case Nothing:
			{
				break;
			}
		}
		return ret;
	}

	private String getValue(MethodType type, MethodParams mp, String input)
	{
		String pattern = this.whatToParse + mp.getDivider();
		Vector<String> grepped = StringUtils.grep(input, pattern, false);
		EntriesScorer<String> es = new EntriesScorer<String>(true);
		for (String val : grepped)
		{
			String parsed = "";
			switch (type)
			{
				case Split:
				{
					parsed = StringUtils.Split(val, mp.getDivider(), mp.getIndex(), mp.isExtension());
					break;
				}
				case KeyValue:
				{
					parsed = StringUtils.KeyValue(val, mp.getDivider(), mp.getIndex());
					break;
				}
			}
			if (!parsed.trim().replace(mp.getDivider(), "").isEmpty())
			{
				es.add(parsed);
			}
		}
		return es.getBestScore().getKey();
	}
}
