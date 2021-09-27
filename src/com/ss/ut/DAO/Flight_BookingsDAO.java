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
import com.ss.ut.ent.Flight_Bookings;

/**
 * @author brandon
 *
 */
public class Flight_BookingsDAO extends BaseDAO {

	public Flight_BookingsDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Flight_Bookings> format(ResultSet data) throws SQLException {
		List<Flight_Bookings> flight_bookings = new ArrayList<Flight_Bookings>();
		
		while(data.next())
		{
			flight_bookings.add(new Flight_Bookings(data.getInt("flight_id"), data.getInt("booking_id")));
		}
		
		return flight_bookings;
	}
	
	public void insertFlight_Bookings(Flight_Bookings flight_bookings) throws SQLException
	{
		write("INSERT INTO flight_bookings (flight_id, booking_id) values (?, )", new Object[] {flight_bookings.getFlight_id(), flight_bookings.getBooking_id()});
	}

	public void updateFlight_Bookings(Flight_Bookings flight_bookings) throws SQLException
	{
		//write("UPDATE flight_bookings SET (flight_id = ?, booking_id = ?) WHERE (flight_id = ?, booking_id = ?)", new Object[] {airplane.getType_id(), airplane.getId()});
	}
	
	public void deleteFlight_Bookings(Flight_Bookings flight_bookings) throws SQLException
	{
		write("DELETE FROM flight_bookings WHERE (flight_id = ? AND booking_id = ?)", new Object[] {flight_bookings.getFlight_id(), flight_bookings.getBooking_id()});
	}
	
	public List <Flight_Bookings> readFlight_Bookings() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM flight_bookings", null);
	}
}
