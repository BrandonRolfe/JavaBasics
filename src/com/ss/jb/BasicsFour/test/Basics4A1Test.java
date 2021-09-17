/**
 * Method tests for Basics4A1
 * 
 */
package com.ss.jb.BasicsFour.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ss.jb.BasicsFour.Basics4A1;

/**
 * @author brandon
 *
 */
public class Basics4A1Test {

	// Checks if an instance can be gotten
	@Test
	public void getInstanceTest()
	{
		assertNotNull(Basics4A1.getInstance());
	}
}
