/**
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Producer extends Thread {
	BoundedBuffer buffer;
	
	
	public Producer(BoundedBuffer buff)
	{
		buffer = buff;
	}
	
	public void run()
	{
		long randSeed = System.currentTimeMillis();
		java.util.Random RNG = new java.util.Random(randSeed);
		
		for(Integer i = 0; i < 100; i++)
		{
			buffer.enqueue(RNG.nextInt(99));
		}
	}
}
