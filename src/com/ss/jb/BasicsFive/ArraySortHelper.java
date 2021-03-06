/**
 * Helper method for the ArraySort interface
 * 
 */
package com.ss.jb.BasicsFive;

/**
 * @author brandon
 *
 */
public class ArraySortHelper {

	public static String[] sortEFirst(String[] arr)
	{
		int size = arr.length;

		for(int i = 0; i<size-1; i++) {
			for (int j = i+1; j<arr.length; j++)
			{
				// If the next string starts with 'e', move it up
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
}