/**
 * Receives values from the command line parameters.
 * Any values that can be summed will be and any that cannot will be counted
 * Both results will be displayed
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
	 * 		command line arguments
	 */
	public static void main(String[] args) {
		
		float total        = 0; // Total sum
		int numberOfFails  = 0; // Number of values that could not be parsed to floats
		int numberOfValues = 0; // Number of values given by the command line arguments
		
		// Loops through all of the command line arguments
		for(String i:args)
		{
			// Tries to parse an argument into a Float
			try
			{
				total += Float.parseFloat(i);
			}
			// Increases the number of fails if it cannot be parsed
			catch (Exception e)
			{
				numberOfFails++;
			}
			// Increases the number of values regardless
			finally
			{
				numberOfValues++;
			}
		}
		
		// Prints the results
		System.out.println("Sum: "                    + String.format("%.3f",total));
		System.out.println("Number of fails: "        + numberOfFails);
		System.out.println("Number of values given: " + numberOfValues);
	}
}
