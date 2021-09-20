/**
 * 
 */
package com.ss.jb.BasicsFive.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jb.BasicsFive.Basics5A1P2;

/**
 * @author brandon
 *
 */
public class Basics5A1P2Test {
	Basics5A1P2 funs = new Basics5A1P2();
	
	List<Integer> numberList = new ArrayList<Integer>();
	
	@Test
	public void formatIntegersTest() {
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		
		assertEquals(funs.formatIntegers(numberList), "o5, e6, o7");
	}

}
