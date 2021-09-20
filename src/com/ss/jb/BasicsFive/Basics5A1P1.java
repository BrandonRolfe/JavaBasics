/**
 * Demonstrates a number of sorts using a functional interface and lambda expressions
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.Arrays;
/**
 * @author brandon
 * 
 * Sort:
 * https://www.tutorialspoint.com/How-to-sort-a-String-array-in-Java
 */
public class Basics5A1P1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Sorts an array of strings by length smallest to largest
		ArraySort sortLength = (arr) ->
		{
			for(int i = 0; i < arr.length - 1; i++)
			{
				for (int j = i + 1; j < arr.length; j++)
				{
		            if(arr[i].length() - arr[j].length() > 0)
		            {
		               String temp = arr[i];
		               arr[i]      = arr[j];
		               arr[j]      = temp;
		            }
				}
			}
			return arr;
		};
		
		// Sorts an array of strings by length largest to smallest
		ArraySort sortReverseLength = (arr) ->
		{

			for(int i = 0; i < arr.length - 1; i++)
			{
				for (int j = i + 1; j < arr.length; j++)
				{
		            if(arr[i].length() - arr[j].length() < 0)
		            {
		               String temp = arr[i];
		               arr[i]      = arr[j];
		               arr[j]      = temp;
		            }
				}
			}
			return arr;
		};
		
		// Sorts an array of strings alphabetically by the first character
		ArraySort sortAlphabetical = (arr) ->
		{
			for(int i = 0; i < arr.length - 1; i++)
			{
				for (int j = i + 1; j < arr.length; j++)
				{
		            if(arr[i].charAt(0) - arr[j].charAt(0) > 0)
		            {
		               String temp = arr[i];
		               arr[i]      = arr[j];
		               arr[j]      = temp;
		            }
				}
			}
			return arr;
		};
		
		// Loops through an array, sorting them alphabetically
		// This is not used
		ArraySort sortAlphabetical2 = (arr) ->
		{
			for(int i = 0; i < arr.length - 1; i++)
			{
				for (int j = i + 1; j < arr.length; j++)
				{
		            if(arr[i].compareTo(arr[j]) > 0)
		            {
		               String temp = arr[i];
		               arr[i]      = arr[j];
		               arr[j]      = temp;
		            }
				}
			}
			return arr;
		};
		
		// Sorts an array of strings, placing strings with the first character 'e' at the beginning
		ArraySort sortEFirst = (arr) ->
		{
			for(int i = 0; i < arr.length - 1; i++)
			{
				for (int j = i + 1; j < arr.length; j++)
				{
		            if(arr[j].charAt(0) == 'e')
		            {
		               String temp = arr[i];
		               arr[i]      = arr[j];
		               arr[j]      = temp;
		            }
				}
			}
			return arr;
		};
		
		// Sorts an array of strings, placing strings with the first character 'e' at the beginning using a helper class
		ArraySort sortEFirstHelper = (arr) -> ArraySortHelper.sortEFirst(arr);
		
		// Test data
		String[] newArr = new String[] {"one11111", "another word" ,"two2", "eac", "econ", "thr"};
		
		// Sample Tests
		System.out.println("Size Sort");
		System.out.println((Arrays.toString(sortLength.sort(newArr))));
		System.out.println("Reverse Size Sort");
		System.out.println((Arrays.toString(sortReverseLength.sort(newArr))));
		System.out.println("Alphabetical Sort");
		System.out.println((Arrays.toString(sortAlphabetical.sort(newArr))));
		System.out.println("E Sort");
		System.out.println((Arrays.toString(sortEFirst.sort(newArr))));
		System.out.println("E Sort W/ Helper");
		System.out.println((Arrays.toString(sortEFirstHelper.sort(newArr))));
	}

}