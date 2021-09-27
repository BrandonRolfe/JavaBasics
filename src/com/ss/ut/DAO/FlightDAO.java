/**
 * 
 */
package com.ss.ut.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.ut.ent.Airplane;
import com.ss.ut.ent.Airport;
import com.ss.ut.ent.Flight;
import com.ss.ut.ent.Route;

/**
 * @author brandon
 *
 */
public class FlightDAO extends BaseDAO {

	public FlightDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Flight> format(ResultSet data) throws SQLException {
		List<Flight> flights = new ArrayList<Flight>();
		
		while(data.next())
		{
			flights.add(new Flight(data.getInt("id"), data.getInt("route_id"), data.getInt("airplane_id"), data.getString("departure_time"), data.getInt("reserved_seats"), data.getFloat("seat_price")));
		}
		
		return flights;
	}
	
	public void insertFlight(Flight flight)// throws SQLException
	{
		try {
			write("INSERT INTO flight (id, route_id, airplane_id, departure_time, reserved_seats, seat_price) values (?, ?, ?, ?, ?, ?)", new Object[] {flight.getId(),flight.getRoute_id(), flight.getAirplane_id(), flight.getDeparture_time(), flight.getReserved_seats(), flight.getSeat_price()});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateFlight(Flight flight) throws SQLException
	{
		write("UPDATE flight SET route_id = ?, airplane_id = ?, departure_time = ?, reserved_seats = ?, seat_price = ? WHERE (id = ?)", new Object[] {flight.getRoute_id(), flight.getAirplane_id(), flight.getDeparture_time(), flight.getReserved_seats(), flight.getSeat_price(), flight.getId()});
	}
	
	public void deleteFlight(Flight flight) throws SQLException
	{
		write("DELETE FROM flight WHERE (id = ?)", new Object[] {flight.getId()});
	}
	
	public List <Flight> readFlights() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM flight", null);
	}
	
	public List <Flight> checkFlight(Flight flight) throws ClassNotFoundException, SQLException
	{
		return (read("SELECT * FROM flight WHERE id = ?", new Object[] {flight.getId()}));
	}
}
