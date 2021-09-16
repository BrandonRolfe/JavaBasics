/**
 * Reads a file and counts how many of a single character exist in it.
 * The character to search for can be given via the command line.
 * If no character is given, the character 'e' will be searched for
 * 
 */
package com.ss.jb.BasicsThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author brandon
 *
 */
public class Basics3A3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Character searchChar;		// Character to be searched for
		Integer numberOfCharsFound; // Count of how many times the searched for character has been found
		
		Basics3A3 funs = new Basics3A3();
		
		// Attempts to get the first character of the command line arguments
		try
		{
			searchChar = Character.toLowerCase(args[0].charAt(0));
			System.out.println("\'" + searchChar + "\' was entered.\n" );
		}
		// If no argument was found, default to 'e'
		catch (Exception e)
		{
			searchChar = 'e';
			System.out.println("No character was entered.\n");
		}

		// Searches the file for the searched for character
		numberOfCharsFound = funs.countChars((int) searchChar);
		
		// If only one instance of the character was found
		if(numberOfCharsFound == 1)
		{
			System.out.println(numberOfCharsFound + " " + searchChar + " was found.");
		}
		// If more than one or zero instances of the character were found
		else
		{
			System.out.println(numberOfCharsFound + " " + searchChar + "'s were found.");
		}
	}
	
	/**
	 * Counts the number of times a given character appears in a preset file
	 * 
	 * @param searchChar - Character to be searched for
	 */
	public Integer countChars(Integer searchChar)
	{
		Integer charsFound = 0; // Number of times the searched for character has been found
		
		// Attempts to open a file reader with the given path
		try(BufferedReader buffer = new BufferedReader(new FileReader("src/com/ss/jb/BasicsThree/ShadowWiki")))
		{
			System.out.println("File Found");
			
			Integer currentChar; // Current character being checked
			
			// Priming read for the loop
			currentChar = Character.toLowerCase(buffer.read());
			
			// Loops while not at the end of file
			while(currentChar != -1)
			{
				// If the current character is the same as the searched for character, increment the found count
				if(searchChar == currentChar)
				{
					charsFound++;
				}
				
				// Read for next loop iteration
				currentChar = Character.toLowerCase(buffer.read());
			}
		}
		// If no file was found to read from
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
			return 0;
		}
		// If another exception occurred
		catch(Exception e)
		{
			System.out.println("Exception");
			return 0;
		}
		
		// Return the number of instances of the searched for character that occurred
		return charsFound;
	}
}
