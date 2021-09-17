/**
 * Method tests for BoundedBuffer
 * 
 */
package com.ss.jb.BasicsFour.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ss.jb.BasicsFour.BoundedBuffer;

/**
 * @author brandon
 *
 */
public class BoundedBufferTest {
	
	// Checks if the empty buffer check is accurate
	@Test
	public void ifEmptyTest() {
		BoundedBuffer buffer = new BoundedBuffer(5);
		
		assertTrue(buffer.ifEmpty());
	}

	// Checks if the full buffer check is accurate
	@Test
	public void ifFullTest() {
		BoundedBuffer buffer = new BoundedBuffer(5);
		
		for(int i = 0; i < 5; i++)
		{
			buffer.enqueue(5);
		}
		
		assertTrue(buffer.ifFull());
	}
	
	// Checks if the buffer can enqueue and dequeue properly
	@Test
	public void enqueueDequeueSingleTest() {
		BoundedBuffer buffer = new BoundedBuffer(5);
		
		buffer.enqueue(10);
		assertEquals(10, (int) buffer.dequeue());
	}
	
	// Checks if the buffer can enqueue and dequeue properly with multiple values
	@Test
	public void enqueueDequeueMultiTest() {
		BoundedBuffer buffer = new BoundedBuffer(5);
		
		buffer.enqueue(10);
		buffer.enqueue (7);
		buffer.enqueue( 3);
		assertEquals(10, (int) buffer.dequeue());
		assertEquals( 7, (int) buffer.dequeue());
		assertEquals( 3, (int) buffer.dequeue());
	}

	
	
	// Checks if the buffer can enqueue and dequeue properly with multiple values and overloaded
	@Test
	public void enqueueDequeueOverloadTest() {
		BoundedBuffer buffer = new BoundedBuffer(5);
		
		// Producer
		Runnable prod = new Runnable() {
			@Override
			public void run()
			{
				buffer.enqueue(10);
				buffer.enqueue( 7);
				buffer.enqueue( 3);
				buffer.enqueue( 4);
				buffer.enqueue( 5);
				buffer.enqueue( 6);
			}
		};
		
		// Consumer
		Runnable cons = new Runnable() {
			@Override
			public void run()
			{
				assertEquals(10, (int) buffer.dequeue());
				assertEquals( 7, (int) buffer.dequeue());
				assertEquals( 3, (int) buffer.dequeue());
				assertEquals( 4, (int) buffer.dequeue());
				assertEquals( 5, (int) buffer.dequeue());
				assertEquals( 6, (int) buffer.dequeue());
			}
		};
		
		new Thread(prod).start();
		new Thread(cons).start();
	}
}
