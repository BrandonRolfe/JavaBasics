/**
 * Receives a list of Strings and returns a list of Strings with all instances of 'x' removed
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author brandon
 *
 */
public class Basics5A2P4 {
	/**
	 * Receives a list of Strings and returns a list of Strings with all instances of 'x' removed
	 * 
	 * @param intList - list of integers
	 *
	 */
	public List<String> noX(List<String> stringList)
	{
		List<String> newStrings = new ArrayList<String>();
		
		StringBuilder tempString = new StringBuilder(); // Contains the output string during construction
		String[] newStringPieces;						// Contains the pieces of a split string
		
		// Loops through each string in the list
		for(String str: stringList)
		{
			// Splits the current string on any instances of 'x'
			newStringPieces = str.split("x");
			
			// Loops through the array of string pieces
			for(String strPiece: newStringPieces)
			{
				// Appends the piece onto the rest of the string
				tempString.append(strPiece);
			}
			// Adds the string to the new list
			newStrings.add(tempString.toString());
		}
		return newStrings;
	}
}