/**
 * 
 */
package com.ss.jb.BasicsFive.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.ss.jb.BasicsFive.ArraySortHelper;

/**
 * @author brandon
 *
 */
public class ArraySortHelperTest {
	@Test
	public void sortEFirstTest()
	{
		String[] testString = {"abc", "d", "efg"};
		String result = Arrays.toString((ArraySortHelper.sortEFirst(testString)));
		assertTrue((result.compareTo("[efg, abc, d]") == 0 || result.compareTo("[efg, d, abc]") == 0) == true);
	}
		
}
