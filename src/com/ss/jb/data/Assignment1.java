/**
 * Prints a four shapes using loops
 * 
 */
package com.ss.jb.data;

/**
 * @author brandon
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Prints the first shape
		System.out.println("1)");
		PrintAsterisks(1);
		PrintAsterisks(2);
		PrintAsterisks(3);
		PrintAsterisks(4);
		PrintPeriods(9);
		
		// Prints the second shape
		System.out.println("2)");
		PrintPeriods(10);
		PrintAsterisks(4);
		PrintAsterisks(3);
		PrintAsterisks(2);
		PrintAsterisks(1);
		
		// Prints the third shape
		System.out.println("3)");
		PrintSpaces(5);
		PrintAsterisks(1);
		PrintSpaces(4);
		PrintAsterisks(3);
		PrintSpaces(3);
		PrintAsterisks(5);
		PrintSpaces(2);
		PrintAsterisks(7);
		PrintPeriods(11);
	
		// Prints the fourth shape
		System.out.println("4)");
		PrintPeriods(12);
		PrintSpaces(2);
		PrintAsterisks(7);
		PrintSpaces(3);
		PrintAsterisks(5);
		PrintSpaces(4);
		PrintAsterisks(3);
		PrintSpaces(5);
		PrintAsterisks(1);
	}

	/**
	 * Prints the desired number of asterisks and moves to the next line
	 * 
	 * @param howMany
	 * 		how many asterisks are to be printed
	 */
	public static void PrintAsterisks (int howMany)
	{
		// Prints the desired number of asterisks minus one
		for(int i = 1; i < howMany; i++)
		{
			System.out.print("*");
		}
		
		// Prints the last asterisk and moves to the next line
		System.out.println("*");
	}
	
	/**
	 * Prints the desired number of periods and moves to the next line
	 * 
	 * @param howMany
	 * 		how many periods are to be printed
	 */
	public static void PrintPeriods (int howMany)
	{
		// Prints the desired number of periods minus one
		for(int i = 1; i < howMany; i++)
		{
			System.out.print(".");
		}
		
		// Prints the last space and moves to the next line
		System.out.println(".");
	}
	
	/**
	 * Prints the desired number of spaces
	 * 
	 * @param howMany
	 * 		how many spaces are to be printed
	 */
	public static void PrintSpaces (int howMany)
	{
		// Prints the desired number of spaces
		for(int i = 1; i <= howMany; i++)
		{
			System.out.print(" ");
		}
	}
}
