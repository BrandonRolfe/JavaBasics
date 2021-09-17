/**
 * Uses a producer, consumer, and a bounded buffer to evaluate one hundred random numbers and report how many were even
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
		// Instantiates the buffer
		BoundedBuffer buff = new BoundedBuffer(5);
		
		// Instantiates the producer and consumer with the buffer connecting them
		Producer prod = new Producer(buff);
		Consumer cons = new Consumer(buff);
		
		// Starts the producer and consumer
		prod.start();
		cons.start();
	}
}
