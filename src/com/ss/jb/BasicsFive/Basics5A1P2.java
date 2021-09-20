/**
 * Formats a list of integers into a comma separated list of integers with a prefix denoting odd or even
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.List;
import java.util.ArrayList;

/**
 * @author brandon
 *
 */
public class Basics5A1P2 {

	/**
	 * Test main for methods
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Basics5A1P2 funs = new Basics5A1P2();
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		long randSeed = System.currentTimeMillis();
		java.util.Random RNG = new java.util.Random(randSeed);
		
		numberList.add(RNG.nextInt(99));
		numberList.add(RNG.nextInt(99));
		numberList.add(RNG.nextInt(99));
		
		System.out.println(funs.formatIntegers(numberList));

	}
	
	/**
	 * Formats a list of integers and returns a comma separated list of integers with a prefix denoting odd or even
	 * 
	 * @param nums - list of integers
	 */
	public String formatIntegers(List<Integer> nums)
	{
		// Evaluates an integer for being odd
		IntegerEval isOdd = (integer) ->
		{
			return (integer % 2 != 0);
		};
		
		StringBuilder tempString = new StringBuilder(); // Contains the output string during construction
		
		// Loops through the list of integers
		for(Integer integer: nums)
		{
			// If odd, denote 'o'
			if(isOdd.evaluate(integer))
			{
				tempString.append("o");
			}
			// If even, denote 'e'
			else
			{
				tempString.append("e");
			}
			
			// Add a comma and space after every number
			tempString.append(integer + ", ");
		}
		// Remove the trailing comma and space after the last value
		tempString.delete(tempString.length() - 2, tempString.length());
		
		return tempString.toString();
	}
}