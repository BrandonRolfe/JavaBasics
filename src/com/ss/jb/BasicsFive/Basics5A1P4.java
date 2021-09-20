/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.time.LocalDate;

/**
 * @author brandon
 *
 */
public class Basics5A1P4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, 6, 4);
		
		date = LocalDate.of(date.getYear(), 1, date.getDayOfMonth());
		for(Integer i = 0; i < 12; i++)
		{
			LocalDate currentDate = date.plusMonths(i);
			System.out.println(currentDate.getMonth() + ": " + currentDate.lengthOfMonth() + " days.");
		}
	}
}
