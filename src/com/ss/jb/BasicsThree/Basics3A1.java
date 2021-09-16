/**
 * Prints the file name of every file, directory, and contents of that directory in a given directory
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
public class Basics3A1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		Basics3A1 funs = new Basics3A1();
		
		Path userPath;  // Entered path
		
		// Prompt for and get the path to search
		System.out.print("Please enter a file path: ");
		userPath = Paths.get(input.nextLine());
		
		// Prints the files, directories, and contents of those directories at the given path
		funs.printDirectory(userPath, 0);
	}
	
	/**
	 * Prints the contents of a given path while falling into subdirectories and printing the contents as well
	 * Depth is for formatting and readability
	 * 
	 * @param givenPath - The path to the directory to be printed
	 * @param depth		- Depth of the directory being printed
	 * 
	 */
	public void printDirectory (Path givenPath, Integer depth)
	{
		// Attempts to scan the directory given
		try(DirectoryStream<Path> str =  Files.newDirectoryStream(givenPath))
		{
			// Loops through every item in the directory and prints it's name
			for(Path entry: str)
			{
				// Print spaces for subdirectory readability
				for(Integer i = 0; i < depth; i++)
				{
					System.out.print("   ");
				}
				
				// Print the file/directory name
				System.out.println(entry.getFileName());
				
				// If the current entry is a directory, enter it and print it's files
				if(Files.isDirectory(entry))
				{
					printDirectory(entry, (depth + 1));
				}
			}
		}
		// If the given directory does not exist
		catch (IOException e)
		{
			System.out.println("Directory does not exist");
		}
	}
}
