/**
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
public class Basics5A2P6 {

	// This would not normally be nested within another class, but I put it this way to preserve the naming convention of my assignment files
	public static class SampleSingleton {

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
}
