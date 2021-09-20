/**
 * Receives a list of integers and returns a list of doubled integers
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
	/**
	 * Receives a list of integers and returns a list of doubled integers
	 * 
	 * @param intList - list of integers
	 *
	 */
	public List<Integer> doubling(List<Integer> intList)
	{
		List<Integer> newInts = new ArrayList<Integer>();
		
		// Loops through each integer in the list
		for(Integer in: intList)
		{
			// Adds the doubled digit to the new list
			newInts.add(in * 2);
		}
		return newInts;
	}
}