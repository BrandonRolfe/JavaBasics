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
public class Basics5A1P6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate dateOld = LocalDate.of(2014, 6, 4);
		LocalDate date = LocalDate.of(2021, 8, 13);
		
		if(date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY)
		{
			System.out.println(date.toString() + " is an instance of Friday the Thirteenth");
		}
		else
		{
			System.out.println(date.toString() + " is not an instance of Friday the Thirteenth");
		}
		
	}

}
