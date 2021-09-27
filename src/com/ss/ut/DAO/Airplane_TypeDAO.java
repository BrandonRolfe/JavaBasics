/**
 * 
 */
package com.ss.ut.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.ut.ent.Airplane_Type;
import com.ss.ut.ent.Airport;

/**
 * @author brandon
 *
 */
public class Airplane_TypeDAO extends BaseDAO {

	public Airplane_TypeDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Airplane_Type> format(ResultSet data) throws SQLException {
		List<Airplane_Type> airplane_types = new ArrayList<Airplane_Type>();
		
		while(data.next())
		{
			airplane_types.add(new Airplane_Type(data.getInt("id"), data.getInt("max_capacity")));
		}
		
		return airplane_types;
	}
	
	public void insertAirplane_Type(Airplane_Type airplane_type) throws SQLException
	{
		write("INSERT INTO airplane_type (max_capacity) values (?)", new Object[] {airplane_type.getMax_capacity()});
	}

	public void updateAirplane_Type(Airplane_Type airplane_type) throws SQLException
	{
		write("UPDATE airplane_type SET (max_capacity = ?) WHERE (id = ?)", new Object[] {airplane_type.getMax_capacity(), airplane_type.getId()});
	}
	
	public void deleteAirplane_Type(Airplane_Type airplane_type) throws SQLException
	{
		write("DELETE FROM airplane_type WHERE (id = ?)", new Object[] {airplane_type.getId()});
	}
	
	public List <Airplane_Type> readAirplane_Types() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM airplane_type", null);
	}
}
