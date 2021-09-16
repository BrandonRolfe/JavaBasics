/**
 * 
 */
package com.ss.jb.BasicsThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Path;

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
		
		Path userPath;
		Object[] files;
		System.out.print("Please enter a file path: ");
		userPath = Paths.get(input.nextLine());
		
		try
		{
			Stream<Path> str =  Files.list(userPath);
			
			//files = str.toArray();
			//System.out.println(files[0].getClass());
			System.out.println(str.toString());
		}
		catch (IOException e)
		{
			System.out.println("Directory does not exist");
		}

	}

}