/**
 * 
 */
package com.ss.ut.base;

import java.sql.SQLException;

import com.ss.ut.ent.Airport;
import com.ss.ut.serv.Admin;

/**
 * @author brandon
 *
 */
public class TestMenu {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Admin ad = new Admin();
		//System.out.println(ad.addFlight(new Route(null, "ATL", "BWI"), new Flight(75, null, null, "2014-06-1 08:00:00", 1, 5.99f )));
		
		//for(Flight f: ad.readFlights())
		{
			//System.out.println(f.getId());
		}
		
		ad.updateAirport(new Airport("TET", "Test 2 updated"));

	}

}
