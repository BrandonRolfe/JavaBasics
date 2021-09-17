/**
 * This class will consume 100 integer values from a BoundedBuffer, calculate how many are even, and print the result
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Consumer extends Thread{
	BoundedBuffer buffer;  // Buffer to get input from
	
	Integer evenCount = 0; // Number of even integers found
	
	// Constructor that receives a BoundedBuffer
	public Consumer(BoundedBuffer buff)
	{
		buffer = buff;
	}
	
	public void run()
	{
		// Loops 100 times
		for(Integer i = 0; i < 100; i++)
		{
			// Gets a value from the buffer and increment the even count if the value is even
			if(isEven(buffer.dequeue()))
			{
				evenCount++;
			}
		}
		// After all of the values have been checked, print the results
		System.out.println(evenCount + " even number(s) found.");
	}
	
	// Checks if an integer is even
	public Boolean isEven(Integer input)
	{
		if(input % 2 == 0)
		{
			return Boolean.TRUE;
		}
		else
		{
			return Boolean.FALSE;
		}
	}
}
