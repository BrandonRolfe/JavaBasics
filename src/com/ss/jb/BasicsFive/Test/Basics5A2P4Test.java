/**
 * 
 */
package com.ss.jb.BasicsFive.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jb.BasicsFive.Basics5A2P4;

/**
 * @author brandon
 *
 */
public class Basics5A2P4Test {
	Basics5A2P4 funs = new Basics5A2P4();
	
	List<String> numberList = new ArrayList<String>();
	
	@Test
	public void doublingTest() {
		numberList.add("xox");
		numberList.add("oox");
		numberList.add("xoxo");
		
		assertEquals(funs.noX(numberList).toString(), "[o, oo, oo]");
	}

}