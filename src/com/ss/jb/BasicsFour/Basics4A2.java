/**
 * Creates a deadlock between two threads
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Basics4A2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer firstInt  = 5;
		Integer secondInt = 10;
		
		// First thread
		Runnable thread1 = new Runnable() {
			@Override
			public void run()
			{
				try
				{
					// Locks the first object
					synchronized(firstInt)
					{
						System.out.println(firstInt);
						try 
						{
							Thread.sleep(1000);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
						// Tries to lock the second object
						synchronized(secondInt)
						{
							
						}
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		
		// Second thread
		Runnable thread2 = new Runnable() {
			@Override
			public void run()
			{
				try
				{
					// Locks the second object
					synchronized(secondInt)
					{
						System.out.println(secondInt);
						try 
						{
							Thread.sleep(1000);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
						// Tries to lock the first object
						synchronized(firstInt)
						{
							
						}
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		
		// Starts both threads
		new Thread(thread1).start();
		new Thread(thread2).start();
	}

}
