/**
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class BoundedBuffer {
	private Integer[] buffer;
	private Integer enqueuePoint = 0;
	private Integer dequeuePoint = 0;
	
	
	public BoundedBuffer(int size)
	{
		buffer = new Integer[size];
	}

	public synchronized void enqueue(Integer input)
	{
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
		
		buffer[enqueuePoint] = input;
		
		if(enqueuePoint < (buffer.length - 1))
		{
			enqueuePoint++;
		}
		else
		{
			enqueuePoint = 0;
		}
		
		return;
	}
	
	public synchronized Integer dequeue()
	{
		Integer returningInt;
		
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
		returningInt = buffer[dequeuePoint];
		buffer[dequeuePoint] = null;
		if(dequeuePoint < (buffer.length - 1))
		{
			dequeuePoint++;
		}
		else
		{
			dequeuePoint = 0;
		}
		
		return returningInt;
		
	}
	
	public Boolean ifEmpty()
	{
		return (buffer[dequeuePoint] == null);
	}
	
	public Boolean ifFull()
	{
		return (buffer[enqueuePoint] != null);
	}
}
