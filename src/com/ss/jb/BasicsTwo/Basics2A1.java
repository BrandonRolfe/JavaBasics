/**
 * Receives three numbers and sums them
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Basics2A1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float total = 0;
		int numberOfFails = 0;
		
		for(String i:args)
		{
			try
			{
				total += Float.parseFloat(i);
			}
			catch (Exception e)
			{
				numberOfFails++;
			}
		}
		
		System.out.println("Sum: " + total);
		
		System.out.println("Number of fails: " + numberOfFails);
	}
}
