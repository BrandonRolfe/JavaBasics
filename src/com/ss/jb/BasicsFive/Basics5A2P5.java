/**
 * 
 */
package com.ss.jb.BasicsFive;

/**
 * @author brandon
 *
 */
public class Basics5A2P5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basics5A2P5 funs = new Basics5A2P5();
		Integer[] sampleInts = {1, 2, 2, 3, 4};
		Integer sampleTarget = 5;

		funs.evaluateSet(sampleInts, sampleTarget);
	}
	
	public Integer[] evaluateSet(Integer[] ints, Integer target)
	{
		if(sumSet(ints) == target)
		{
			return ints;
		}
		
		for(Integer i = 0; i < ints.length; i++)
		{
			Integer setInt = isSet(ints, i);
			for(Integer j = 0; j < setInt; j++)
			{
				ints[i+j] = 0;
			}
			
			evaluateSet(ints, target);
		}
		
		
		
		
		return null;
	}
	
	public Integer sumSet(Integer[] ints)
	{
		Integer sum = 0;
		
		for(Integer i: ints)
		{
			sum += i;
		}
		return sum;
	}
	
	public Integer isSet(Integer[] fullSet, Integer startIndex)
	{
		Integer total = 1;
		Integer nextIndex = startIndex + 1;
		
		while(fullSet[startIndex] == fullSet[nextIndex])
		{
			total++;
			nextIndex++;
		};
		
		return total;
	}

}
