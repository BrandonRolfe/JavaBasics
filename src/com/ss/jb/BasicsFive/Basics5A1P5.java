/**
 * 
 */
package com.ss.jb.BasicsFive;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author brandon
 *
 */
public class Basics5A1P5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, 6, 4);
		date = LocalDate.of(date.getYear(), date.getMonthValue(), 1);
		
		while(date.getDayOfWeek() != DayOfWeek.MONDAY)
		{
			date = date.plusDays(1);
		}
		
		LocalDate endDate = LocalDate.of(date.getYear(), date.getMonthValue(), date.lengthOfMonth());
		System.out.println(date.getDayOfWeek() + "s in " + date.getMonth());
		
		while(date.getMonthValue() == endDate.getMonthValue() && date.getDayOfMonth() <= endDate.lengthOfMonth())
		{
			System.out.println(date.getMonthValue() + "/" + date.getDayOfMonth());
			date = date.plusDays(7);
		}
	}

}
