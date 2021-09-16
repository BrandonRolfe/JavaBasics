/**
 * 
 */
package com.ss.jb.BasicsThree;

import java.io.BufferedReader;
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
		Character searchChar;
		Integer numberOfCharsFound;
		Basics3A3 funs = new Basics3A3();
		
		try
		{
			searchChar = Character.toLowerCase(args[0].charAt(0));
			System.out.println("\'" + searchChar + "\' was entered.\n" );
		}
		catch (Exception e)
		{
			searchChar = 'e';
			System.out.println("No character was entered.\n");
		}

		numberOfCharsFound = funs.countChars((int) searchChar);
		if(numberOfCharsFound == 1)
		{
			System.out.println(numberOfCharsFound + " " + searchChar + " was found.");
		}
		else
		{
			System.out.println(numberOfCharsFound + " " + searchChar + "'s were found.");
		}
	}
	
	public Integer countChars(Integer searchChar)
	{
		Integer charsFound = 0;
		
		try(BufferedReader buffer = new BufferedReader(new FileReader("src/com/ss/jb/BasicsThree/ShadowWiki")))
		{
			System.out.println("File Found");
			
			Integer currentChar;
			
			currentChar = Character.toLowerCase(buffer.read());
			
			while(currentChar != -1)
			{
				if(searchChar == currentChar)
				{
					charsFound++;
				}
				currentChar = Character.toLowerCase(buffer.read());
			}
		}
		catch(Exception e)
		{
			System.out.println("No File Found");
		}
		return charsFound;
	}

}
