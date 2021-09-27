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
import com.ss.ut.ent.Passenger;

/**
 * @author brandon
 *
 */
public class PassengerDAO extends BaseDAO {

	public PassengerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Passenger> format(ResultSet data) throws SQLException {
		List<Passenger> passengers = new ArrayList<Passenger>();
		
		while(data.next())
		{
			passengers.add(new Passenger(data.getInt("id"), data.getInt("booking_id"), data.getString("given_name"), data.getString("family_name"), data.getString("dob"), data.getString("gender"), data.getString("address")));
		}
		
		return passengers;
	}
	
	public void insertPassenger(Passenger passenger) throws SQLException
	{
		write("INSERT INTO passenger (booking_id, given_name, family_name, dob, gender, address) values (?, ?, ?, ?, ?, ?)", new Object[] {passenger.getBooking_id(), passenger.getGiven_name(), passenger.getFamily_name(), passenger.getDob(), passenger.getGender(), passenger.getAddress()});
	}

	public void updatePassenger(Passenger passenger) throws SQLException
	{
		write("UPDATE passenger SET booking_id = ?, given_name = ?, family_name = ?, dob = ?, gender = ?, address = ? WHERE (id = ?)", new Object[] {passenger.getBooking_id(), passenger.getGiven_name(), passenger.getFamily_name(), passenger.getDob(), passenger.getGender(), passenger.getAddress(), passenger.getId()});
	}
	
	public void deletePassenger(Passenger passenger) throws SQLException
	{
		write("DELETE FROM passenger WHERE (id = ?)", new Object[] {passenger.getId()});
	}
	
	public List <Passenger> readPassengers() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM passenger", null);
	}
}
