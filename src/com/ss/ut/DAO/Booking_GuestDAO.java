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
import com.ss.ut.ent.Booking_Agent;
import com.ss.ut.ent.Booking_Guest;
import com.ss.ut.ent.Booking_User;

/**
 * @author brandon
 *
 */
public class Booking_GuestDAO extends BaseDAO {

	public Booking_GuestDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Booking_Guest> format(ResultSet data) throws SQLException {
		List<Booking_Guest> booking_guests = new ArrayList<Booking_Guest>();
		
		while(data.next())
		{
			booking_guests.add(new Booking_Guest(data.getInt("booking_id"), data.getString("contact_email"), data.getString("contact_phone")));
		}
		
		return booking_guests;
	}
	
	public void insertBooking_Guest(Booking_Guest booking_guest) throws SQLException
	{
		write("INSERT INTO booking_guest (booking_id, contact_email, contact_phone) values (?, ?, ?)", new Object[] {booking_guest.getBooking_id(), booking_guest.getContact_email(), booking_guest.getContact_phone()});
	}

	public void updateBooking_Guest(Booking_Guest booking_guest) throws SQLException
	{
		write("UPDATE booking_guest SET contact_email = ?, contact_phone = ? WHERE (id = ?)", new Object[] {booking_guest.getContact_email(), booking_guest.getContact_phone(), booking_guest.getBooking_id()});
	}
	
	public void deleteBooking_Guest(Booking_Guest booking_guest) throws SQLException
	{
		write("DELETE FROM booking_guest WHERE (booking_id = ?)", new Object[] {booking_guest.getBooking_id()});
	}
	
	public List <Booking_Guest> readBooking_Guest() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM booking_guest", null);
	}
}
