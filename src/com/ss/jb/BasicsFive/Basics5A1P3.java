/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author brandon
 *
 */
public class Basics5A1P3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringListFilter filterAThree = (list) -> list.stream().filter((str) -> str.charAt(0) == 'a' && str.length() == 3).toList();
	
		List<String> newList = new ArrayList<String>();
		
		newList.add("one11111");
		newList.add("another word");
		newList.add("awo2");
		newList.add("aac");
		newList.add("econ");
		newList.add("thr");
		newList.add("abc");
		
		System.out.println(filterAThree.filter(newList).toString());

	}

}
