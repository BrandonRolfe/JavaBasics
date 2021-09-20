/**
 * Example of a fixed singleton class
 * 
 */
package com.ss.jb.BasicsFive;

/*
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
*/

/**
 * @author brandon
 *
 */

public class SampleSingleton {

	// This is commented out because I was not able to import it without adding modules
	//private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		
		// If instance is null
		if(instance == null)
		{
			// Lock the singleton class
			synchronized (SampleSingleton.class)
			{
				// If instance is still null
				if(instance == null)
				{
					// Make new instance
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
}