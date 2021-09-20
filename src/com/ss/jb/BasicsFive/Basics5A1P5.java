/**
 * Evaluates how many Mondays are in a given month
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
		LocalDate date = LocalDate.of(2014, 6, 4); // Starting date
		
		// Format day
		date = LocalDate.of(date.getYear(), date.getMonthValue(), 1);
		
		// Loops while the day of the week is not monday
		while(date.getDayOfWeek() != DayOfWeek.MONDAY)
		{
			date = date.plusDays(1);
		}
		
		LocalDate endDate = LocalDate.of(date.getYear(), date.getMonthValue(), date.lengthOfMonth()); // Last day of month
		
		System.out.println(date.getDayOfWeek() + "s in " + date.getMonth());
		
		// Loops while not at the end of the month
		while(date.getMonthValue() == endDate.getMonthValue() && date.getDayOfMonth() <= endDate.lengthOfMonth())
		{
			System.out.println(date.getMonthValue() + "/" + date.getDayOfMonth());
			
			date = date.plusDays(7);
		}
	}
}