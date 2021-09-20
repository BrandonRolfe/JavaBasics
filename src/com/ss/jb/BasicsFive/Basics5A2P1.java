/**
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
		IntegerEval isOdd = (integer) ->
		{
			return (integer % 2 != 0);
		};
		
		IntegerEval isPrime = (integer) ->
		{
			return (Math.sqrt(integer) % 1 == 0);
		};
		
		IntegerEval isPalindrome = (integer) ->
		{
			char[] integerChars = integer.toString().toCharArray();
			
			//if(isOdd.evaluate(integerChars.length))
			for(Integer i = 0; i < (integerChars.length / 2); i++)
			{
				if(integerChars[i] != integerChars[integerChars.length - i - 1])
				{
					return Boolean.FALSE;
				}
			}
			
			return Boolean.TRUE;
		};
		
		
		System.out.println(isOdd.evaluate(444465));
		System.out.println(isPrime.evaluate(4));
		System.out.println(isPalindrome.evaluate(46112264));

	}

}
