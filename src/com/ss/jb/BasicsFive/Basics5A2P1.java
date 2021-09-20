/**
 * Demonstrates a number of integer evaluations using a functional interface and lambda expressions
 * 
 */
package com.ss.jb.BasicsFive;

/**
 * @author brandon
 *
 */
public class Basics5A2P1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Checks if an entered integer is odd 
		IntegerEval isOdd = (integer) -> (integer % 2 != 0);
		
		// Checks if an entered integer is prime
		IntegerEval isPrime = (integer) -> (Math.sqrt(integer) % 1 == 0);
		
		// Checks if an entered integer is a palindrome
		IntegerEval isPalindrome = (integer) ->
		{
			char[] integerChars = integer.toString().toCharArray();
			
			// Loops through the integer, working inward from each side
			for(Integer i = 0; i < (integerChars.length / 2); i++)
			{
				// If two numbers are not equal, return false and abandon the loop
				if(integerChars[i] != integerChars[integerChars.length - i - 1])
				{
					return Boolean.FALSE;
				}
			}
			// If no faulty digits were found, return true
			return Boolean.TRUE;
		};
		
		// Tests of lambda expressions
		System.out.println(isOdd.evaluate(444465));
		System.out.println(isPrime.evaluate(4));
		System.out.println(isPalindrome.evaluate(46112264));
	}
}