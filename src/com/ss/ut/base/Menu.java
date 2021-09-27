/**
 * 
 */
package com.ss.ut.base;

import java.sql.SQLException;

import com.ss.ut.ent.Airport;
import com.ss.ut.ent.Flight;
import com.ss.ut.ent.Route;
import com.ss.ut.serv.Admin;

/**
 * @author brandon
 *
 */
public class Menu {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		java.util.Scanner input = new java.util.Scanner(System.in);
		Menu funs = new Menu();
		
		Integer choice;
		
		do
		{
			System.out.println("Welcome to the Utopia Airlines Management System. Which category of a user are you");
			System.out.println("   1: Employee/Agent");
			System.out.println("   2: Administrator");
			System.out.println("   3: Traveler");
			System.out.println("   0: Quit");
			
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice)
			{
			case 1: funs.employee();
				break;
			case 2: funs.administrator();
				break;
			case 3: funs.traveler();
			break;
			case 0: System.out.println("Goodbye");
			break;
			default: System.out.println("Invalid input");
			break;
			}
			
			
		} while(choice != 0);
		
		
	}
	
	public void employee()
	{
		System.out.println("Employee is not currently supported");
		
		return;
	}
	
	public void administrator()
	{
		System.out.println("Administrator is currently supported");
		new AdministratorMenu().MainMenu();
		
		return;
	}
	
	public void traveler()
	{
		System.out.println("Traveler is not currently supported");
		
		return;
	}

}
