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
import com.ss.ut.ent.Booking;

/**
 * @author brandon
 *
 */
public class BookingDAO extends BaseDAO {

	public BookingDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Booking> format(ResultSet data) throws SQLException {
		List<Booking> bookings = new ArrayList<Booking>();
		
		while(data.next())
		{
			bookings.add(new Booking(data.getInt("id"), data.getInt("is_active"), data.getString("confirmation_code")));
		}
		
		return bookings;
	}
	
	public void insertBooking(Booking booking) throws SQLException
	{
		write("INSERT INTO booking (is_active, confirmation_code) values (?, ?)", new Object[] {booking.getIs_active(), booking.getConfirmation_code()});
	}

	public void updateBooking(Booking booking) throws SQLException
	{
		write("UPDATE booking SET is_active = ?, confirmation_code = ? WHERE (id = ?)", new Object[] {booking.getIs_active(), booking.getConfirmation_code(), booking.getId()});
	}
	
	public void deleteBooking(Booking booking) throws SQLException
	{
		write("DELETE FROM booking WHERE (id = ?)", new Object[] {booking.getId()});
	}
	
	public List <Booking> readBookings() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM booking", null);
	}
}
