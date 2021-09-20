/**
 * 
 */
package com.ss.jb.BasicsFive;

/**
 * @author brandon
 *
 */
public class Basics5A2P5L {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basics5A2P5L funs = new Basics5A2P5L();
		Integer[] sampleInts = {1, 2, 2, 3, 4};
		Integer sampleTarget = 5;

		System.out.println(funs.evaluateSet(sampleInts, sampleTarget));
	}
	
	public Integer[] evaluateSet(Integer[] ints, Integer target)
	{
		System.out.println(ints.length);
		if(sumSet(ints) == target)
		{
			return ints;
		}
		
		if(ints.length != 1)
		{
		for(Integer i = 0; i < ints.length; i++)
		{
			Integer setInt = isSet(ints, i);
			for(Integer j = 0; j < setInt; j++)
			{
				ints[i+j] = 0;
			}
			
			Integer[] newInts = new Integer[ints.length - setInt];
			System.out.println(ints.length);
			
			for(Integer tempint: ints)
			System.out.println("t" + tempint.toString());
			
			
			System.out.println(newInts.length);
			Integer newIntsIndex = 0;
			for(Integer newInt: ints)
			{
				if(newInt != 0)
				{
					newInts[newIntsIndex] = newInt;
					newIntsIndex++;
				}
			}
			evaluateSet(newInts, target);
		}
		
		}
		
		
		return null;
	}
	
	public Integer sumSet(Integer[] ints)
	{
		Integer sum = 0;
		
		for(Integer i: ints)
		{
			System.out.println(i);
			sum += i;
		}
		return sum;
	}
	
	public Integer isSet(Integer[] fullSet, Integer startIndex)
	{
		Integer total = 1;
		Integer nextIndex = startIndex + 1;
		
		try {
			while(fullSet[startIndex] == fullSet[nextIndex])
			{
				total++;
				nextIndex++;
			};
		} catch (ArrayIndexOutOfBoundsException e) {
			return total;
		}
		
		return total;
	}

}
