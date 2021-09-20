/**
 * Demonstrates filtering using a functional interface and a lambda expression
 * 
 */
package com.ss.jb.BasicsFive;

import java.util.ArrayList;
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
		// Receives a list of strings and returns a list of strings that start with the character 'a' and are three characters long
		StringListFilter filterAThree = (list) -> list.stream().filter((str) -> str.charAt(0) == 'a' && str.length() == 3).toList();
	
		// Method test
		List<String> newList = new ArrayList<String>(); // List to be tested
		
		// Test data
		newList.add("one11111");
		newList.add("another word");
		newList.add("awo2");
		newList.add("aac");
		newList.add("econ");
		newList.add("thr");
		newList.add("abc");
		
		// Show result
		System.out.println(filterAThree.filter(newList).toString());
	}
}