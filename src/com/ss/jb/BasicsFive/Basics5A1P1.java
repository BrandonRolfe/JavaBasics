/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * @author brandon
 *
 */
public class Basics5A1P1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ArraySort sortLength = (arr) ->
		{
			int size = arr.length;

			for(int i = 0; i<size-1; i++)
			{
				for (int j = i+1; j<arr.length; j++)
				{
		            if(arr[i].length() - arr[j].length()>0)
		            {
		               String temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
				}
			}
			return arr;
		};
		
		ArraySort sortReverseLength = (arr) ->
		{
			int size = arr.length;

			for(int i = 0; i<size-1; i++)
			{
				for (int j = i+1; j<arr.length; j++)
				{
		            if(arr[i].length() - arr[j].length()<0)
		            {
		               String temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
				}
			}
			return arr;
		};
		
		ArraySort sortAlphabetical = (arr) ->
		{
			int size = arr.length;

			for(int i = 0; i<size-1; i++) {
				for (int j = i+1; j<arr.length; j++)
				{
		            if(arr[i].charAt(0) - arr[j].charAt(0)>0)
		            {
		               String temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
				}
			}
			return arr;
		};
		
		ArraySort sortAlphabetical2 = (arr) ->
		{
			int size = arr.length;

			for(int i = 0; i<size-1; i++) {
				for (int j = i+1; j<arr.length; j++)
				{
		            if(arr[i].compareTo(arr[j])>0)
		            {
		               String temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
				}
			}
			return arr;
		};
		
		ArraySort sortEFirst = (arr) ->
		{
			int size = arr.length;

			for(int i = 0; i<size-1; i++) {
				for (int j = i+1; j<arr.length; j++)
				{
		            if(arr[j].charAt(0) == 'e')
		            {
		               String temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
				}
			}
			return arr;
		};
		
		ArraySort sortEFirstHelper = (arr) -> ArraySortHelper.sortEFirst(arr);
		
		String[] newArr = new String[] {"one11111", "another word" ,"two2", "eac", "econ", "thr"};
		
		System.out.println("Size Sort");
		System.out.println((Arrays.toString(sortLength.sort(newArr))));
		System.out.println("Reverse Size Sort");
		System.out.println((Arrays.toString(sortReverseLength.sort(newArr))));
		System.out.println("Alphabetical Sort");
		System.out.println((Arrays.toString(sortAlphabetical2.sort(newArr))));
		System.out.println("E Sort");
		System.out.println((Arrays.toString(sortEFirst.sort(newArr))));
		System.out.println("E Sort W/ Helper");
		System.out.println((Arrays.toString(sortEFirstHelper.sort(newArr))));
	}

}
