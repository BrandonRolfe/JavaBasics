/**
 * Receives a list of integers and returns a list of the right most digit of each integer
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author brandon
 *
 */
public class Basics5A2P2 {
	/**
	 * Receives a list of integers and returns a list of the right most digit of each integer
	 * 
	 * @param intList - list of integers
	 */
	public List<Integer> rightDigit(List<Integer> intList)
	{
		List<Integer> newInts = new ArrayList<Integer>();
		
		// Loops through each integer in the list
		for(Integer in: intList)
		{
			// Adds the last digit to the new list
			newInts.add(in % 10);
		}
		return newInts;
	}
}