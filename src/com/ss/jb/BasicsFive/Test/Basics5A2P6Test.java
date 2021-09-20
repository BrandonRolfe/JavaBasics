/**
 * 
 */
package com.ss.jb.BasicsFive.Test;

import static org.junit.Assert.*;

import org.junit.Test;

//import com.ss.jb.BasicsFive.Basics5A2P6;
import com.ss.jb.BasicsFive.SampleSingleton;

/**
 * @author brandon
 *
 */
public class Basics5A2P6Test {
	SampleSingleton funs = new SampleSingleton();
	
	@Test
	public void getInstanceTest() {
		assertNotNull(funs.getInstance());
	}

}
