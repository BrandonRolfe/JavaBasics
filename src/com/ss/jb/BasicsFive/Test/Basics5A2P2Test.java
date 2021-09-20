/**
 * 
 */
package com.ss.jb.BasicsFive.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jb.BasicsFive.Basics5A2P2;

/**
 * @author brandon
 *
 */
public class Basics5A2P2Test {
	Basics5A2P2 funs = new Basics5A2P2();
	
	List<Integer> numberList = new ArrayList<Integer>();
	
	@Test
	public void rightDigitTest() {
		numberList.add(505);
		numberList.add(606);
		numberList.add(707);
		
		assertEquals(funs.rightDigit(numberList).toString(), "[5, 6, 7]");
	}

}
