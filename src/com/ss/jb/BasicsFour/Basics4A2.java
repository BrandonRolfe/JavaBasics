/**
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
		Integer firstInt = 5;
		Integer secondInt = 10;
		
		
		
		Runnable thread1 = new Runnable() {

			@Override
			public void run()
			{
				try
				{
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
		
		Runnable thread2 = new Runnable() {

			@Override
			public void run()
			{
				try
				{
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
		
		new Thread(thread1).start();
		new Thread(thread2).start();
	}

}
