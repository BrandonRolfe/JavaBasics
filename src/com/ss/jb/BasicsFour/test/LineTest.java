/**
 * Method tests for Line
 * 
 */
package com.ss.jb.BasicsFour.test;

import com.ss.jb.BasicsFour.Line;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author brandon
 *
 */
public class LineTest {
	Line line = (new Line(1.0, 2.0, 3.0, 4.0));
	
	@Test
	public void slopeEqualsTest()
	{
		assertEquals(1.0, line.getSlope(), .0001);
	}
	
	@Test
	public void parallelTrueTest()
	{
		Line line2 = (new Line(2.0, 3.0, 4.0, 5.0));
		assertTrue(line.parallelTo(line2));
	}
	
	@Test
	public void parallelFalseTest()
	{
		Line line2 = (new Line(1.0, 3.0, 4.0, 5.0));
		assertFalse(line.parallelTo(line2));
	}
	
	@Test
	public void distanceEqualsTest()
	{
		assertEquals(2.8284, line.getDistance(), .0001);
	}
}
