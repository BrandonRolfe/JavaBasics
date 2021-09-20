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
public class Basics5A2P2Sample {
	public static void main(String[] args) {
		Basics5A2P2Sample funs = new Basics5A2P2Sample();
		
		List<Integer> ints = new ArrayList<Integer>();
		List<String> strings = new ArrayList<String>();
		
		ints.add(525);
		ints.add(665);
		ints.add(87);
		
		strings.add("xox");
		strings.add("ooo");
		strings.add("oxox");
		
		
		System.out.println(funs.rightDigit(ints));
		System.out.println(funs.doubling(ints));
		System.out.println(funs.noX(strings));
	}
	
	public List<Integer> rightDigit(List<Integer> intList)
	{
		List<Integer> newInts = new ArrayList<Integer>();
		
		for(Integer in: intList)
		{
			newInts.add(in % 10);
		}
		return newInts;
	}
	
	public List<Integer> doubling(List<Integer> intList)
	{
		List<Integer> newInts = new ArrayList<Integer>();
		
		for(Integer in: intList)
		{
			newInts.add(in * 2);
		}
		return newInts;
	}
	
	public List<String> noX(List<String> stringList)
	{
		List<String> newStrings = new ArrayList<String>();
		
		for(String str: stringList)
		{
			String[] newStringPieces = str.split("x");
			String   newString = "";
			
			for(String strPiece: newStringPieces)
			{
				newString = newString.concat(strPiece);
			}
			newStrings.add(newString);
		}
		return newStrings;
	}
	
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
