package edu.br.ufpe.cin.sword.cm.strategies;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public interface LiteralHelperStrategy<Literal> {
	boolean complementaryOf(Literal literal, Literal other);
	
	default Set<Literal> complementaryOf(Literal literal, Collection<Literal> set) {
		return set.stream()
				.filter(other -> complementaryOf(literal, other))
				.collect(Collectors.toSet());
	}
}
