/**
 * 
 */
package it.freax.fpm.compiler.edo;

import java.util.List;

/**
 * @author klez
 */
public abstract class OutputData<OUT>
{
	private OUT outputPayload;
	private List<ErrorReport> errorReports;

	public OUT getOutputPayload()
	{
		return outputPayload;
	}

	public void setOutputPayload(OUT outputPayload)
	{
		this.outputPayload = outputPayload;
	}

	public List<ErrorReport> getErrorReports()
	{
		return errorReports;
	}

	public void setErrorReports(List<ErrorReport> errorReports)
	{
		this.errorReports = errorReports;
	}
}
