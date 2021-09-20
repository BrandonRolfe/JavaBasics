/**
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
	
	public String formatIntegers(List<Integer> nums)
	{
		IntegerEval isOdd = (integer) ->
		{
			return (integer % 2 != 0);
		};
		
		StringBuilder tempString = new StringBuilder();
		//System.out.println(tempString.toString());
		
		for(Integer integer: nums)
		{
			if(isOdd.evaluate(integer))
			{
				tempString.append("o");
			}
			else
			{
				tempString.append("e");
			}
			tempString.append(integer + ", ");
		}
		
		tempString.delete(tempString.length() - 2, tempString.length() - 1);
		
		return tempString.toString();
	}

}
