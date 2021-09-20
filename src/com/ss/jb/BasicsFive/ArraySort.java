/**
 * Functional interface for sorting string arrays
 * 
 */
package com.ss.jb.BasicsFive;

/**
 * @author brandon
 *
 */
@FunctionalInterface
public interface ArraySort {
	abstract String[] sort(String[] arr);
}