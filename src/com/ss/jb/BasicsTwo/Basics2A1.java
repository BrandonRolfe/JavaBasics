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
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int firstNumber;  // Holds the first  entered number
		int secondNumber; // Holds the second entered number
		int thirdNumber;  // Holds the third  entered number
		
		// Gets the first number
		System.out.print("Enter the first value: ");
		firstNumber = input.nextInt();
		
		// Gets the second number
		System.out.print("Enter the second value: ");
		secondNumber = input.nextInt();
		
		// Gets the third number
		System.out.print("Enter the third value: ");
		thirdNumber = input.nextInt();

		// Gives the sum of the three entered numbers
		System.out.print("The sum of the three values is " + (firstNumber + secondNumber + thirdNumber));
	}
}
