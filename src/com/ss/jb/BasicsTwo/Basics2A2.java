/**
 * 
 */
package com.ss.jb.BasicsTwo;

/**
 * @author brandon
 *
 */
public class Basics2A2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] testArray = { { 45, 852,   8},
							  { 74, 933,   3},
							  {249,  78, 662} };
		
		int largestI = 0; // Holds the i index of the largest value
		int largestJ = 0; // Holds the j index of the largest value
		
		// Loops through all of the i indexes
		for(int i = 0; i < 3; i++)
		{
			// Loops through all of the j indexes
			for(int j = 0; j < 3; j++)
			{
				// Checks if the current number is larger than the previously chosen largest number
				if(testArray[i][j] > testArray[largestI][largestJ])
				{
					largestI = i;
					largestJ = j;
				}
			}
		}
		
		// Prints the results
		System.out.println("largest number: " + testArray[largestI][largestJ]);
		System.out.println("Largest number position: [" + largestI + "] [" + largestJ + "]");
	}

}
