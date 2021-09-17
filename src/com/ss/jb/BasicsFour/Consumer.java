/**
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Consumer extends Thread{
	BoundedBuffer buffer;
	Integer evenCount = 0;
	
	public Consumer(BoundedBuffer buff)
	{
		buffer = buff;
	}
	
	public void run()
	{
		for(Integer i = 0; i < 100; i++)
		{
			if(isEven(buffer.dequeue()))
			{
				evenCount++;
			}
		}
		System.out.println(evenCount + " even number(s) found.");
	}
	
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
