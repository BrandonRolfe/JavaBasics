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
		
		int largestI = 0;
		int largestJ = 0;
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(testArray[largestI][largestJ] < testArray[i][j])
				{
					largestI = i;
					largestJ = j;
				}
			}
		}
		
		
		System.out.println("largest number: " + testArray[largestI][largestJ]);
		System.out.println("Largest number position: [" + largestI + "] [" + largestJ + "]");
		//System.out.println(largestI);
		//System.out.println(largestJ);

	}

}
