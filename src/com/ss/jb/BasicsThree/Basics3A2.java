/**
 * 
 */
package com.ss.jb.BasicsThree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/ss/jb/BasicsThree/Text", true)))
		{
			writer.write("some more text");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
