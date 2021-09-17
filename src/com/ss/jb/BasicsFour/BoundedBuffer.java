/**
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class BoundedBuffer {
	private final Integer DEFAULTSIZE = 10; // Default buffer size
	
	private Integer[] buffer;         // Array of Integers that acts as the buffer
	private Integer enqueuePoint = 0; // Point where the next enqueued value will be entered
	private Integer dequeuePoint = 0; // Point where the next dequeued value will be taken from
	
	// Default constructor
	public BoundedBuffer()
	{
		buffer = new Integer[DEFAULTSIZE];
	}
	
	// Integer constructor
	public BoundedBuffer(int size)
	{
		buffer = new Integer[size];
	}

	// Receives the next value and attempts to put it in the queue. If the queue is full, it will wait until a space is available.
	public synchronized void enqueue(Integer input)
	{
		// Loops while the buffer is full
		while(ifFull())
		{
			try
			{
				wait(100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		// Enqueues the data into the buffer
		buffer[enqueuePoint] = input;
		
		// If the next enqueue point is not off of the end of the array, increment the point
		if(enqueuePoint < (buffer.length - 1))
		{
			enqueuePoint++;
		}
		// If the next enqueue point is off of the end of the array, reset to the beginning of the array
		else
		{
			enqueuePoint = 0;
		}
		
		return;
	}
	// Returns the first value in the queue. If the queue is empty, it will wait until a value is available.
	public synchronized Integer dequeue()
	{
		Integer returningInt;
		
		// Loops while the buffer is empty
		while(ifEmpty())
		{
			try
			{
				wait(100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		// Dequeues the data into a temporary holder
		returningInt = buffer[dequeuePoint];
		
		// Removes the dequeued value from the array
		buffer[dequeuePoint] = null;
		
		// If the next dequeue point is not off of the end of the array, increment the point
		if(dequeuePoint < (buffer.length - 1))
		{
			dequeuePoint++;
		}
		// If the next dequeue point is off of the end of the array, reset to the beginning of the array
		else
		{
			dequeuePoint = 0;
		}
		
		return returningInt;
		
	}
	
	// Checks if the buffer is empty
	public Boolean ifEmpty()
	{
		return (buffer[dequeuePoint] == null);
	}
	
	// Checks if the buffer is full
	public Boolean ifFull()
	{
		return (buffer[enqueuePoint] != null);
	}
}
