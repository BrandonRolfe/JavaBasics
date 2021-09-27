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
import com.ss.ut.ent.Route;

/**
 * @author brandon
 *
 */
public class RouteDAO extends BaseDAO {

	public RouteDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Route> format(ResultSet data) throws SQLException {
		List<Route> routes = new ArrayList<Route>();
		
		while(data.next())
		{
			routes.add(new Route(data.getInt("id"), data.getString("origin_id"), data.getString("destination_id")));
		}
		
		return routes;
	}
	
	public void insertRoute(Route route) throws SQLException
	{
		write("INSERT INTO Route (origin_id, destination_id) values (?, ?)", new Object[] {route.getOrigin_id(), route.getDestination_id()});
	}

	public void updateRoute(Route route) throws SQLException
	{
		write("UPDATE route SET (origin_id = ?, destination_id = ?) WHERE (id = ?)", new Object[] {route.getOrigin_id(), route.getDestination_id(), route.getId()});
	}
	
	public void deleteRoute(Route route) throws SQLException
	{
		write("DELETE FROM route WHERE (id = ?)", new Object[] {route.getId()});
	}
	
	public List <Route> readRoutes() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM route", null);
	}
}
