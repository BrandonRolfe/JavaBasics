/**
 * Demonstrates a simple double check locking singleton
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Basics4A1 {

	private static volatile Basics4A1 instance;
	
	// Gets the single instance of the singleton
	public  static Basics4A1 getInstance()
	{
		// If instance is null
		if(instance == null)
		{
			// Lock the singleton class
			synchronized (Basics4A1.class)
			{
				// If instance is still null
				if(instance == null)
				{
					// Make new instance
					instance = new Basics4A1();
				}
			}
		}
		return instance;
	}
}
