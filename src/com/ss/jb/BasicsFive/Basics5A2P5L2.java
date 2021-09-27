/**
 * 
 */
package com.ss.jb.BasicsFive;

/**
 * @author brandon
 *
 */
public class Basics5A2P5L2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basics5A2P5L2 funs = new Basics5A2P5L2();
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
				Integer[] copyInts = ints;
				for(Integer j = 0; j < setInt; j++)
				{
					copyInts[i+j] = 0;
				}
				
				Integer[] newInts = new Integer[copyInts.length - setInt];
				System.out.println(copyInts.length);
				
				for(Integer tempint: copyInts)
				System.out.println("t" + tempint.toString());
				
				
				System.out.println(newInts.length);
				Integer newIntsIndex = 0;
				for(Integer newInt: copyInts)
				{
					if(newInt != 0)
					{
						newInts[newIntsIndex] = newInt;
						newIntsIndex++;
					}
				}
				Integer[] answerInts = evaluateSet(newInts, target);
				if(answerInts != null)
				{
					return answerInts;
				}
				
			}
		
		}
		
		
		return null;
	}
	
	public Integer sumSet(Integer[] ints)
	{
		Integer sum = 0;
		
		try {
			for(Integer i: ints)
			{
				System.out.println(i);
				sum += i;
			}
		} catch (NullPointerException e) {
			return 0;
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
