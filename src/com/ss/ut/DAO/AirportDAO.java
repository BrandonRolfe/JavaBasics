/**
 * 
 */
package com.ss.ut.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.ut.ent.Airport;

/**
 * @author brandon
 *
 */
public class AirportDAO extends BaseDAO {

	public AirportDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Airport> format(ResultSet data) throws SQLException {
		List<Airport> airports = new ArrayList<Airport>();
		
		while(data.next())
		{
			airports.add(new Airport(data.getString("iata_id"), data.getString("city")));
		}
		
		return airports;
	}
	
	public void insertAirport(Airport airport) throws SQLException
	{
		write("INSERT INTO airport (iata_id, city) values (?, ?)", new Object[] {airport.getIata_id(), airport.getCity()});
	}

	public void updateAirport(Airport airport) throws SQLException
	{
		write("UPDATE airport SET (city = ?) WHERE (iata_id = ?)", new Object[] {airport.getCity(), airport.getIata_id()});
	}
	
	public void deleteAirport(Airport airport) throws SQLException
	{
		write("DELETE FROM airport WHERE (iata_id = ?)", new Object[] {airport.getIata_id()});
	}
	
	public List <Airport> readAirports() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM airport", null);
	}
}
