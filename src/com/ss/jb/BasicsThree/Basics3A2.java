/**
 * Appends some text onto an existing file
 */
package com.ss.jb.BasicsThree;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author brandon
 *
 */
public class Basics3A2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Attempts to open a file writer set to append with the given path
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/ss/jb/BasicsThree/Text", true)))
		{
			// Appends some text
			writer.write("some more text");
		}
		// If no file was found
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
			return;
		}
		// If an IO exception occurred
		catch (IOException e)
		{
			System.out.println("IO Exception");
			return;
		}
	}
}
