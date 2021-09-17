/**
 * 
 */
package com.ss.jb.BasicsFour;

/**
 * @author brandon
 *
 */
public class Basics4A3 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		BoundedBuffer buff = new BoundedBuffer(5);
		
		Producer prod = new Producer(buff);
		Consumer cons = new Consumer(buff);
		
		prod.start();
		cons.start();
		
		
		
		
		
		
		
		
		
		/*
		buff.enqueue(17);
		buff.enqueue(11);
		
		System.out.println(buff.dequeue());
		System.out.println(buff.dequeue());
		*/
	}
	


}
