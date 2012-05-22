package it.freax.fpm.core.solver.core;

import java.util.Collection;

import it.freax.fpm.core.specs.Spec;

/**
 * This is the abstract Solver for the freax package manager system.
 * This allows other installer-localized Solvers to have a common interface
 * to talk to for the bad job of solving the dlhell.
 * 
 * @author kLeZ-hAcK
 */
public abstract class DependencySolver implements Runnable
{
	private final Collection<Spec> specs;

	public DependencySolver(Collection<Spec> specs)
	{
		this.specs = specs;
	}

	public Collection<Spec> getSpecs()
	{
		return specs;
	}

	public abstract void Solve();
}
