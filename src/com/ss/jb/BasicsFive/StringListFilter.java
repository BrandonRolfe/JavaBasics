/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.List;

/**
 * @author brandon
 *
 */
@FunctionalInterface
public interface StringListFilter {
	
	abstract List<String> filter(List<String> lis);
}
