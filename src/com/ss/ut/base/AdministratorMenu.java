/**
 * 
 */
package com.ss.ut.base;

import java.sql.SQLException;

import com.ss.ut.ent.Airport;
import com.ss.ut.ent.Flight;
import com.ss.ut.ent.Route;
import com.ss.ut.ent.User;
import com.ss.ut.serv.Admin;

/**
 * @author brandon
 *
 */
public class AdministratorMenu {
	public void MainMenu()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Integer choice;
		
		// Loops through main menu
		do
		{
			System.out.println("Administrator main menu");
			System.out.println("   1: Add/Update/Delete/Read Flights");
			System.out.println("   2: Add/Update/Delete/Read Seats");
			System.out.println("   3: Add/Update/Delete/Read Tickets and Passengers");
			System.out.println("   4: Add/Update/Delete/Read Airports");
			System.out.println("   5: Add/Update/Delete/Read Travelers");
			System.out.println("   6: Add/Update/Delete/Read Employees");
			System.out.println("   7: Over-ride Trip Cancellation for a ticket.");
			System.out.println("   0: Back");
			
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice)
			{
			case 1: FlightsMainMenu();
				break;
			case 2: System.out.println("Seats menu not yet implemented");
				break;
			case 3: System.out.println("Tickets and Passengers menu not yet implemented");
				break;
			case 4: AirportsMainMenu();
			break;
			case 5: TravelersMainMenu();
				break;
			case 6: EmployeesMainMenu();
				break;
			case 7: System.out.println("Over-ride Trip Cancellation menu not yet implemented");
				break;
			case 0: System.out.println("Going back");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		} while(choice != 0);
	}
	
	public void FlightsMainMenu()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Integer choice;
		
		do
		{
			System.out.println("Flights main menu");
			System.out.println("   1: Add");
			System.out.println("   2: Update");
			System.out.println("   3: Delete");
			System.out.println("   4: Read");
			System.out.println("   0: Back");
			
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice)
			{
			case 1: FlightsAdd();
				break;
			case 2: FlightsUpdate();
				break;
			case 3: FlightsDelete();
				break;
			case 4: FlightsRead();
				break;
			case 0: System.out.println("Going back");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		} while(choice != 0);
	}
	
	public void FlightsAdd()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		Route route = new Route();
		Flight flight = new Flight();
		
		System.out.println("Please enter the Origin Airport code:");
		route.setOrigin_id(input.nextLine());
		System.out.println("Please enter the Destination Airport code:");
		route.setDestination_id(input.nextLine());
		
		System.out.println("Please enter a Flight ID:");
		flight.setId(input.nextInt());
		input.nextLine();
		
		System.out.println("Please enter the Departure Date/Time in the format of \"YYYY-MM-DD HH:MM:SS\":");
		flight.setDeparture_time(input.nextLine());
		
		System.out.println("Please enter the number of Reserved Seats:");
		flight.setReserved_seats(input.nextInt());
		input.nextLine();
		
		System.out.println("Please enter the Seat Price:");
		flight.setSeat_price(input.nextFloat());
		input.nextLine();
		
		try {
			System.out.println(adminServer.addFlight(route, flight));
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to add flight: SQL exception");
		}
	}
	
	public void FlightsUpdate()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		Route route = new Route();
		Flight flight = new Flight();
		
		String stringInput;
		
		System.out.println("Please enter a Flight ID:");
		try {
			flight = adminServer.readFlight(new Flight(Integer.parseInt(input.nextLine()))).get(0);
		} catch (Exception e1) {
			//e1.printStackTrace();
			System.out.println("Failed to check flight");
		}
		
		System.out.println("Please enter the Origin Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(!stringInput.equals("N/A"));
		{
			System.out.println(stringInput);
			route.setOrigin_id(stringInput);
		}
		System.out.println("Please enter the Destination Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			route.setDestination_id(stringInput);
		}
		
		if(route.getOrigin_id() != null || route.getDestination_id() != null)
		{
			try {
				route = adminServer.checkRoute(route);
				flight.setRoute_id(route.getId());
			} catch (SQLException e) {
				System.out.println("Could not update route");
				return;
			}
		}
		
		System.out.println("Please enter the Departure Date/Time in the format of \"YYYY-MM-DD HH:MM:SS\" or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setDeparture_time(stringInput);
		}
		
		System.out.println("Please enter the number of Reserved Seats or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setReserved_seats(Integer.parseInt(stringInput));
		}
		
		System.out.println("Please enter the Seat Price or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setSeat_price(Float.parseFloat(stringInput));
		}
		
		try {
			adminServer.updateFlight(flight);
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to add flight: SQL exception");
		}
	}
	
	public void FlightsDelete()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		Flight flight = new Flight();
		
		System.out.println("Please enter a Flight ID:");
		try {
			flight = adminServer.readFlight(new Flight(Integer.parseInt(input.nextLine()))).get(0);
		} catch (Exception e1) {
			//e1.printStackTrace();
			System.out.println("Failed to check flight: SQL exception");
		}
		
		try {
			adminServer.deleteFlight(flight);
			System.out.println("Flight deleted");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to delete flight: SQL exception");
		}
	}
	
	public void FlightsRead()
	{
		Admin adminServer = new Admin();
		
		try {
			for(Flight f: adminServer.readFlights()) 
			{
				System.out.println(f.getId() + " " + f.getRoute_id() + " " + f.getDeparture_time() + " ");
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Failed to read flights");
		}
	}
	/***************************************************
	 * Airports
	 ***************************************************/
	
	public void AirportsMainMenu()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Integer choice;
		
		do
		{
			System.out.println("Airports main menu");
			System.out.println("   1: Add");
			System.out.println("   2: Update");
			System.out.println("   3: Delete");
			System.out.println("   4: Read");
			System.out.println("   0: Back");
			
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice)
			{
			case 1: AirportsAdd();
				break;
			case 2: AirportsUpdate();
				break;
			case 3: AirportsDelete();
				break;
			case 4: AirportsRead();
				break;
			case 0: System.out.println("Going back");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		} while(choice != 0);
	}
	
	public void AirportsAdd()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		Airport airport = new Airport();
		
		System.out.println("Please enter the airport's IADA ID:");
		airport.setIata_id(input.nextLine());
		
		System.out.println("Please enter the airport's City:");
		airport.setCity(input.nextLine());
		
		try {
			System.out.println(adminServer.addAirport(airport));
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to add airport: SQL exception");
		}
	}
	
	public void AirportsUpdate()
	{
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		Route route = new Route();
		Flight flight = new Flight();
		
		String stringInput;
		
		System.out.println("Please enter a Flight ID:");
		try {
			flight = adminServer.readFlight(new Flight(Integer.parseInt(input.nextLine()))).get(0);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//route.setOrigin_id(input.nextLine());
		
		System.out.println("Please enter the Origin Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(!stringInput.equals("N/A"));
		{
			System.out.println(stringInput);
			route.setOrigin_id(stringInput);
		}
		System.out.println("Please enter the Destination Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			route.setDestination_id(stringInput);
		}
		
		if(route.getOrigin_id() != null || route.getDestination_id() != null)
		{
			try {
				route = adminServer.checkRoute(route);
				flight.setRoute_id(route.getId());
			} catch (SQLException e) {
				System.out.println("Could not update route");
				return;
			}
		}
		
		System.out.println("Please enter the Departure Date/Time in the format of \"YYYY-MM-DD HH:MM:SS\" or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setDeparture_time(stringInput);
		}
		
		System.out.println("Please enter the number of Reserved Seats or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setReserved_seats(Integer.parseInt(stringInput));
		}
		
		System.out.println("Please enter the Seat Price or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setSeat_price(Float.parseFloat(stringInput));
		}
		
		try {
			adminServer.addFlight(route, flight);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
	public void AirportsDelete()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		System.out.println("Please enter a airport's IATA ID:");
		
		try {
			adminServer.deleteAirport(new Airport(input.nextLine()));
			System.out.println("Airport deleted");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to delete airport: SQL exception");
		}
	}
	
	public void AirportsRead()
	{
		Admin adminServer = new Admin();
		
		try {
			for(Airport a: adminServer.readAirports()) 
			{
				System.out.println(a.getIata_id() + " " + a.getCity());
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Failed to read airports: SQL exception");
		}
	}
	
	
	/***************************************************
	 * Travelers
	 ***************************************************/
	
	public void TravelersMainMenu()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Integer choice;
		
		do
		{
			System.out.println("Travelers main menu");
			System.out.println("   1: Add");
			System.out.println("   2: Update");
			System.out.println("   3: Delete");
			System.out.println("   4: Read");
			System.out.println("   0: Back");
			
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice)
			{
			case 1: TravelersAdd();
				break;
			case 2: TravelersUpdate();
				break;
			case 3: TravelersDelete();
				break;
			case 4: TravelersRead();
				break;
			case 0: System.out.println("Going back");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		} while(choice != 0);
	}
	
	public void TravelersAdd()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		User user = new User();
		user.setRole_id(2);
		
		System.out.println("Please enter the traveler's Given Name:");
		user.setGiven_name(input.nextLine());
		
		System.out.println("Please enter the traveler's Family Name:");
		user.setFamily_name(input.nextLine());
		
		System.out.println("Please enter the traveler's Username");
		user.setUsername(input.nextLine());
		
		System.out.println("Please enter the traveler's Email:");
		user.setEmail(input.nextLine());
		
		System.out.println("Please enter the traveler's Password:");
		user.setPassword(input.nextLine());
		
		System.out.println("Please enter the traveler's Phone number:");
		user.setPhone(input.nextLine());
		
		try {
			System.out.println(adminServer.addTraveler(user));
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to add traveler: SQL exception");
		}
	}
	
	public void TravelersUpdate()
	{
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		Route route = new Route();
		Flight flight = new Flight();
		
		String stringInput;
		
		System.out.println("Please enter a Flight ID:");
		try {
			flight = adminServer.readFlight(new Flight(Integer.parseInt(input.nextLine()))).get(0);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//route.setOrigin_id(input.nextLine());
		
		System.out.println("Please enter the Origin Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(!stringInput.equals("N/A"));
		{
			System.out.println(stringInput);
			route.setOrigin_id(stringInput);
		}
		System.out.println("Please enter the Destination Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			route.setDestination_id(stringInput);
		}
		
		if(route.getOrigin_id() != null || route.getDestination_id() != null)
		{
			try {
				route = adminServer.checkRoute(route);
				flight.setRoute_id(route.getId());
			} catch (SQLException e) {
				System.out.println("Could not update route");
				return;
			}
		}
		
		System.out.println("Please enter the Departure Date/Time in the format of \"YYYY-MM-DD HH:MM:SS\" or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setDeparture_time(stringInput);
		}
		
		System.out.println("Please enter the number of Reserved Seats or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setReserved_seats(Integer.parseInt(stringInput));
		}
		
		System.out.println("Please enter the Seat Price or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setSeat_price(Float.parseFloat(stringInput));
		}
		
		try {
			adminServer.addFlight(route, flight);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
	public void TravelersDelete()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		System.out.println("Please enter a traveler's ID:");
		
		
		try {
			adminServer.deleteTraveler(new User(Integer.parseInt(input.nextLine())));
			System.out.println("Flight deleted");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to delete traveler: SQL exception");
		}
	}
	
	public void TravelersRead()
	{
		Admin adminServer = new Admin();
		
		try {
			for(User u: adminServer.readTravelers()) 
			{
				System.out.println(u.getId() + " " + u.getGiven_name() + " " + u.getFamily_name() + " " + u.getUsername() + " " + u.getEmail() + " " + u.getPhone());
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Failed to read travelers");
		}
	}
	
	
	/***************************************************
	 * Employees
	 ***************************************************/
	
	public void EmployeesMainMenu()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Integer choice;
		
		do
		{
			System.out.println("Travelers main menu");
			System.out.println("   1: Add");
			System.out.println("   2: Update");
			System.out.println("   3: Delete");
			System.out.println("   4: Read");
			System.out.println("   0: Back");
			
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice)
			{
			case 1: TravelersAdd();
				break;
			case 2: TravelersUpdate();
				break;
			case 3: TravelersDelete();
				break;
			case 4: TravelersRead();
				break;
			case 0: System.out.println("Going back");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		} while(choice != 0);
	}
	
	public void EmployeesAdd()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		User user = new User();
		user.setRole_id(1);
		
		System.out.println("Please enter the employee's Given Name:");
		user.setGiven_name(input.nextLine());
		
		System.out.println("Please enter the employee's Family Name:");
		user.setFamily_name(input.nextLine());
		
		System.out.println("Please enter the employee's Username");
		user.setUsername(input.nextLine());
		
		System.out.println("Please enter the employee's Email:");
		user.setEmail(input.nextLine());
		
		System.out.println("Please enter the employee's Password:");
		user.setPassword(input.nextLine());
		
		System.out.println("Please enter the employee's Phone number:");
		user.setPhone(input.nextLine());
		
		try {
			System.out.println(adminServer.addEmployee(user));
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to add employee: SQL exception");
		}
	}
	
	public void EmployeesUpdate()
	{
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		Route route = new Route();
		Flight flight = new Flight();
		
		String stringInput;
		
		System.out.println("Please enter a Flight ID:");
		try {
			flight = adminServer.readFlight(new Flight(Integer.parseInt(input.nextLine()))).get(0);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//route.setOrigin_id(input.nextLine());
		
		System.out.println("Please enter the Origin Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(!stringInput.equals("N/A"));
		{
			System.out.println(stringInput);
			route.setOrigin_id(stringInput);
		}
		System.out.println("Please enter the Destination Airport code or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			route.setDestination_id(stringInput);
		}
		
		if(route.getOrigin_id() != null || route.getDestination_id() != null)
		{
			try {
				route = adminServer.checkRoute(route);
				flight.setRoute_id(route.getId());
			} catch (SQLException e) {
				System.out.println("Could not update route");
				return;
			}
		}
		
		System.out.println("Please enter the Departure Date/Time in the format of \"YYYY-MM-DD HH:MM:SS\" or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setDeparture_time(stringInput);
		}
		
		System.out.println("Please enter the number of Reserved Seats or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setReserved_seats(Integer.parseInt(stringInput));
		}
		
		System.out.println("Please enter the Seat Price or enter N/A for no change:");
		stringInput = input.nextLine();
		if(stringInput != "N/A")
		{
			System.out.println(stringInput);
			flight.setSeat_price(Float.parseFloat(stringInput));
		}
		
		try {
			adminServer.addFlight(route, flight);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
	public void EmployeesDelete()
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		Admin adminServer = new Admin();
		
		System.out.println("Please enter a employee's ID:");
		
		try {
			adminServer.deleteEmployee(new User(Integer.parseInt(input.nextLine())));
			System.out.println("Employee deleted");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Failed to delete employee: SQL exception");
		}
	}
	
	public void EmployeesRead()
	{
		Admin adminServer = new Admin();
		
		try {
			for(User u: adminServer.readEmployees()) 
			{
				System.out.println(u.getId() + " " + u.getGiven_name() + " " + u.getFamily_name() + " " + u.getUsername() + " " + u.getEmail() + " " + u.getPhone());
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Failed to read employees");
		}
	}
}
