/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author brandon
 *
 */
public class Basics5A2P4 {
	public List<String> noXOld(List<String> stringList)
	{
		List<String> newStrings = new ArrayList<String>();
		
		for(String str: stringList)
		{
			newStrings.add(str.replace('x', (Character) null));
		}
		return newStrings;
	}
}
