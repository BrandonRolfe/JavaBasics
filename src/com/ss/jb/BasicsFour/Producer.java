/**
 * This class will produce 100 integer values and place them into a BoundedBuffer
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Producer extends Thread {
	BoundedBuffer buffer; // Buffer to put output onto
	
	// Constructor that receives a BoundedBuffer
	public Producer(BoundedBuffer buff)
	{
		buffer = buff;
	}
	
	public void run()
	{
		// Initializes Random with a random time seed
		long randSeed = System.currentTimeMillis();
		java.util.Random RNG = new java.util.Random(randSeed);
		
		// Loops 100 times
		for(Integer i = 0; i < 100; i++)
		{
			// Generates a random number between 0 and 99, and places it on the buffer
			buffer.enqueue(RNG.nextInt(99));
		}
	}
}
