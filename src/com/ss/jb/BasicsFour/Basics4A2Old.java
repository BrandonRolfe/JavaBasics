/**
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Basics4A2Old {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dead1 = "This is dead 1";
		String dead2 = "This is dead 2";
		
		Basics4A2Old funs = new Basics4A2Old();
		
		//funs.Deadlock ded = new funs.Deadlock().start();
		class DeadLock extends Thread
		{
			public void run()
			{
				synchronized(dead1)
				{
					System.out.println(dead1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(dead2)
					{
						
					}
				}
			}
		}
		
		class DeadLock2 extends Thread
		{
			public void run()
			{
				synchronized(dead2)
				{
					System.out.println(dead2);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(dead1)
					{
						
					}
				}
			}
		}
		
		
		//new funs.Deadlock().start();
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		synchronized(dead1)
		{
			System.out.println(dead1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(dead2)
			{
				
			}
		}
		
		synchronized(dead2)
		{
			System.out.println(dead2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(dead1)
			{
				
			}
		} */
	}

}
