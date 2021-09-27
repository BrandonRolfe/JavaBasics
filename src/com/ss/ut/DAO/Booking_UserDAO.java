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
import com.ss.ut.ent.Booking_User;

/**
 * @author brandon
 *
 */
public class Booking_UserDAO extends BaseDAO {

	public Booking_UserDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Booking_User> format(ResultSet data) throws SQLException {
		List<Booking_User> booking_users = new ArrayList<Booking_User>();
		
		while(data.next())
		{
			booking_users.add(new Booking_User(data.getInt("booking_id"), data.getInt("user_id")));
		}
		
		return booking_users;
	}
	
	public void insertBooking_User(Booking_User booking_user) throws SQLException
	{
		write("INSERT INTO booking_user (booking_id, user_id) values (?, ?)", new Object[] {booking_user.getBooking_id(), booking_user.getUser_id()});
	}

	public void updateBooking_User(Booking_User booking_user) throws SQLException
	{
		//write("UPDATE booking_agent SET (type_id = ?) WHERE (id = ?)", new Object[] {airplane.getType_id(), airplane.getId()});
	}
	
	public void deleteBooking_User(Booking_User booking_user) throws SQLException
	{
		write("DELETE FROM booking_user WHERE (booking_id = ? AND user_id = ?)", new Object[] {booking_user.getBooking_id(), booking_user.getUser_id()});
	}
	
	public List <Booking_User> readBooking_User() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM booking_user", null);
	}
}
