/**
 * Prints the file name of every file in a given directory
 * 
 */
package com.ss.jb.BasicsThree;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;

/**
 * @author brandon
 *
 */
public class Basics3A1Old {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Path userPath;  // Entered path
		
		// Prompt for and get the path to search
		System.out.print("Please enter a file path: ");
		userPath = Paths.get(input.nextLine());
		
		// Attempts to scan the directory given
		try(DirectoryStream<Path> str =  Files.newDirectoryStream(userPath))
		{
			// Loops through every item in the directory and prints it's name
			for(Path entry: str)
			{
				System.out.println(entry.getFileName());
			}
		}
		// If the given directory does not exist
		catch (IOException e)
		{
			System.out.println("Directory does not exist");
		}

	}

}
