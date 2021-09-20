/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author brandon
 *
 */
public class Basics5A2P3 {
	public List<Integer> doubling(List<Integer> intList)
	{
		List<Integer> newInts = new ArrayList<Integer>();
		
		for(Integer in: intList)
		{
			newInts.add(in * 2);
		}
		return newInts;
	}
}
