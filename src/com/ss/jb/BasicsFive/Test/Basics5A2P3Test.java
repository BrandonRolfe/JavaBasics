/**
 * 
 */
package com.ss.jb.BasicsFive.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jb.BasicsFive.Basics5A2P3;

/**
 * @author brandon
 *
 */
public class Basics5A2P3Test {
	Basics5A2P3 funs = new Basics5A2P3();
	
	List<Integer> numberList = new ArrayList<Integer>();
	
	@Test
	public void doublingTest() {
		numberList.add(505);
		numberList.add(606);
		numberList.add(707);
		
		assertEquals(funs.doubling(numberList).toString(), "[1010, 1212, 1414]");
	}

}
