/**
 * Functional interface for evaluating integers
 * 
 */
package com.ss.jb.BasicsFive;

/**
 * @author brandon
 *
 */

@FunctionalInterface
public interface IntegerEval {
	abstract Boolean evaluate(Integer i);
}