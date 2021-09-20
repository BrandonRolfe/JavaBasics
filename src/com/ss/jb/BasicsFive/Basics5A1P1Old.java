/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.lang.reflect.Array;

/**
 * @author brandon
 *
 */
public class Basics5A1P1Old {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ArraySort sortLength = (arr) -> {
			
			
			
			
		return arr;
		};
		
		ArraySort sortReverseLength = (arr) ->
		{
			Integer currentIndex = 1;
			Integer newIndex = 0;
			String tempString;
			String tempStringTwo;
			
			for(int i = 1; i <= arr.length -1; i++)
			{
				currentIndex = i;
				for(int j = (currentIndex - 1); j >= 0 ; j--)
				{
					if(arr[currentIndex].length() >= arr[j].length())
					{
						newIndex = j;
						//break;
					}
				}
				tempString = arr[newIndex];
				arr[newIndex] = arr[i];
				
				for(int j = (currentIndex + 1); j < i; j++)
				{
					tempStringTwo = arr[j];
					arr[j] = tempString;
					tempString = tempStringTwo;
				}
				
				arr[i] = tempString;
				
			}
			
			
			
			
			return arr;
		};
		
		ArraySort sortAlphabetical = (arr) ->
		{
			return arr;
		};
		
		ArraySort sortEFirst = (arr) ->
		{
			return arr;
		};
		
		
		String[] newArr = new String[] {"one11111", "another word" ,"two2", "thr", "secon"};
		
		newArr = sortReverseLength.sort(newArr);
		
		for(String s:newArr)
		{
			System.out.println(s);
		}

	}

}
