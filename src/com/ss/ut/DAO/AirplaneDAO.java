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

/**
 * @author brandon
 *
 */
public class AirplaneDAO extends BaseDAO {

	public AirplaneDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Airplane> format(ResultSet data) throws SQLException {
		List<Airplane> airplanes = new ArrayList<Airplane>();
		
		while(data.next())
		{
			airplanes.add(new Airplane(data.getInt("id"), data.getInt("route_id")));
		}
		
		return airplanes;
	}
	
	public void insertAirplane(Airplane airplane) throws SQLException
	{
		write("INSERT INTO airplane (type_id) values (?)", new Object[] {airplane.getType_id()});
	}

	public void updateAirplane(Airplane airplane) throws SQLException
	{
		write("UPDATE airplane SET (type_id = ?) WHERE (id = ?)", new Object[] {airplane.getType_id(), airplane.getId()});
	}
	
	public void deleteAirplane(Airplane airplane) throws SQLException
	{
		write("DELETE FROM airplane WHERE (id = ?)", new Object[] {airplane.getId()});
	}
	
	public List <Airplane> readAirplanes() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM airplane", null);
	}
}
