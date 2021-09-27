/**
 * 
 */
package com.ss.ut.serv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.ut.DAO.AirportDAO;
import com.ss.ut.DAO.FlightDAO;
import com.ss.ut.DAO.RouteDAO;
import com.ss.ut.DAO.UserDAO;
import com.ss.ut.DAO.Flight_BookingsDAO;
import com.ss.ut.ent.Airport;
import com.ss.ut.ent.Flight;
import com.ss.ut.ent.Route;
import com.ss.ut.ent.User;

/**
 * @author brandon
 *
 */
public class Admin {
	
	
	
	
	
	public String addFlight(Route route, Flight flight) throws SQLException
	{
		Connection conn = null;
		

			try
			{
				conn = new ConnectionUtil().getConnection();
				RouteDAO rdao = new RouteDAO(conn);
				
				System.out.println(route.getOrigin_id());
				System.out.println(route.getDestination_id());
				List <Route> routeCheck = rdao.checkRoute(route);
				
				if(routeCheck.isEmpty())
				{
					try
					{
						flight.setRoute_id(rdao.insertRouteReturnKey(route));
						System.out.println("new route id" + flight.getRoute_id());
					}
					catch (Exception e)
					{
						e.printStackTrace();
						return "Route could not be added";
					}
					// add route
					System.out.println("route check bad");
				}
				else
				{
					flight.setRoute_id(routeCheck.get(0).getId());
					System.out.println("old route id" + flight.getRoute_id());
				}
				
				FlightDAO fdao = new FlightDAO(conn);
				List <Flight> flightCheck = fdao.checkFlight(flight);
				if(!flightCheck.isEmpty())
				{
					//System.out.println(flightCheck.get(0).getId());
					conn.rollback();
					return "Flight already exists";
				}
				
				flight.setAirplane_id(1);
				System.out.println("plane set good");
				fdao.insertFlight(flight);
				System.out.println("insert good");
				conn.commit();
				
				return "Flight addition successful";
			} catch (Exception e) {
				conn.rollback();
				e.printStackTrace();
				return "Flight addition failure";
			}
			finally {
				if(conn != null)
				{
					conn.close();
			
				}
			}

	}
	
	public String updateFlight(Flight flight) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			FlightDAO fdao = new FlightDAO(conn);
			List <Flight> flightCheck = fdao.checkFlight(flight);
			if(flightCheck.isEmpty())
			{
				//System.out.println(flightCheck.get(0).getId());
				return "Flight does not exist";
			}
			
			RouteDAO rdao = new RouteDAO(conn);
			List <Route> routeCheck = rdao.checkRouteById(flight.getRoute_id());
			
			if(routeCheck.isEmpty())
			{
				return "Route does not exist";
			}
			
			fdao.updateFlight(flight);
			conn.commit();
			
			return "Flight update successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "Flight update failure";
		}
		finally {
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public String deleteFlight(Flight flight) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			FlightDAO fdao = new FlightDAO(conn);
			List <Flight> flightCheck = fdao.checkFlight(flight);
			if(flightCheck.isEmpty())
			{
				//System.out.println(flightCheck.get(0).getId());
				return "Flight does not exist";
			}
			Flight_BookingsDAO fbdao = new Flight_BookingsDAO(conn);
			
			fbdao.deleteFlight_BookingsByFlight(flight);
			fdao.deleteFlight(flight);
			conn.commit();
			
			return "Flight deletion successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "Flight deletion failure";
		}
		finally {
			if(conn != null)
			{
				conn.close();
		
			}
		}
		
		
		
	}
	
	public List <Flight> readFlights() throws Exception
	{
		Connection conn = null;
		
		try
		{
			conn = new ConnectionUtil().getConnection();
			FlightDAO fdao = new FlightDAO(conn);
			return fdao.readFlights();
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public List <Flight> readFlight(Flight flight) throws Exception
	{
		Connection conn = null;
		
		try
		{
			conn = new ConnectionUtil().getConnection();
			FlightDAO fdao = new FlightDAO(conn);
			return fdao.checkFlight(flight);
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public Route checkRoute(Route route) throws SQLException
	{
		Connection conn = null;
		

		try
		{
			conn = new ConnectionUtil().getConnection();
			RouteDAO rdao = new RouteDAO(conn);
			List <Route> routeCheck = rdao.checkRoute(route);
			
			if(routeCheck.isEmpty())
			{
				try
				{
					route.setId(rdao.insertRouteReturnKey(route));
				}
				catch (Exception e)
				{
					//return "Route could not be added";
				}
				// add route
				System.out.println("route check bad");
			}
			else
			{
				route.setId(routeCheck.get(0).getId());
				System.out.println("route check good");
			}
		}
		catch(Exception e)
		{
			return null;
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
		
		
		return route;
	}
	
	
	
	
	public String addAirport(Airport airport) throws SQLException
	{
		Connection conn = null;
		
		try
		{
			conn = new ConnectionUtil().getConnection();
			AirportDAO adao = new AirportDAO(conn);
			adao.insertAirport(airport);
			conn.commit();
			
			return "Airport addition successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "Airport addition failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	
	public String updateAirport(Airport airport) throws SQLException
	{
		Connection conn = null;
		
		try
		{
			conn = new ConnectionUtil().getConnection();
			AirportDAO adao = new AirportDAO(conn);
			adao.updateAirport(airport);
			conn.commit();
			
			return "Airport update successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "Airport update failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public String deleteAirport(Airport airport) throws SQLException
	{
		Connection conn = null;
		
		try
		{
			conn = new ConnectionUtil().getConnection();
			AirportDAO adao = new AirportDAO(conn);
			
			List <Airport> airportCheck = adao.readAirportUsage(airport);
			
			if(!airportCheck.isEmpty())
			{
				return "Airport in use";
			}
			
			adao.deleteAirport(airport);
			conn.commit();
			
			
			return "Airport deletion successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "Airport deletion failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public List <Airport> readAirports() throws Exception
	{
		Connection conn = null;
		
		try
		{
			conn = new ConnectionUtil().getConnection();
			AirportDAO adao = new AirportDAO(conn);
			return adao.readAirports();
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	
	public String addTraveler(User user) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			user.setRole_id(2);
			udao.insertUser(user);
			
			conn.commit();
			
			return "User addition successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "User addition failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public String updateTraveler(User user) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			udao.updateUser(user);
			
			conn.commit();
			
			return "User update successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "User update failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public String deleteTraveler(User user) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			udao.deleteUser(user);
			
			conn.commit();
			
			return "User update successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "User update failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public List <User> readTravelers() throws Exception
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			return udao.readUsers();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception();
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}

	
	public String addEmployee(User user) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			user.setRole_id(1);
			udao.insertUser(user);
			
			conn.commit();
			
			return "User addition successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "User addition failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public String updateEmployee(User user) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			udao.updateUser(user);
			
			conn.commit();
			
			return "User update successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "User update failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public String deleteEmployee(User user) throws SQLException
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			udao.deleteUser(user);
			
			conn.commit();
			
			return "User update successful";
		}
		catch(Exception e)
		{
			conn.rollback();
			e.printStackTrace();
			return "User update failure";
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
	
	public List <User> readEmployees() throws Exception
	{
		Connection conn = null;
		try
		{
			conn = new ConnectionUtil().getConnection();
			UserDAO udao = new UserDAO(conn);
			return udao.readAgents();
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
		
			}
		}
	}
}
