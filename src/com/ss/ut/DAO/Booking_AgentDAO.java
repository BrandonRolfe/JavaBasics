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

/**
 * @author brandon
 *
 */
public class Booking_AgentDAO extends BaseDAO {

	public Booking_AgentDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Booking_Agent> format(ResultSet data) throws SQLException {
		List<Booking_Agent> booking_agents = new ArrayList<Booking_Agent>();
		
		while(data.next())
		{
			booking_agents.add(new Booking_Agent(data.getInt("booking_id"), data.getInt("agent_id")));
		}
		
		return booking_agents;
	}
	
	public void insertBooking_Agent(Booking_Agent booking_agent) throws SQLException
	{
		write("INSERT INTO booking_agent (booking_id, agent_id) values (?, ?)", new Object[] {booking_agent.getBooking_id(), booking_agent.getAgent_id()});
	}

	public void updateBooking_Agent(Booking_Agent booking_agent) throws SQLException
	{
		//write("UPDATE booking_agent SET (type_id = ?) WHERE (id = ?)", new Object[] {airplane.getType_id(), airplane.getId()});
	}
	
	public void deleteBooking_Agent(Booking_Agent booking_agent) throws SQLException
	{
		write("DELETE FROM booking_agent WHERE (booking_id = ? AND agent_id = ?)", new Object[] {booking_agent.getBooking_id(), booking_agent.getAgent_id()});
	}
	
	public List <Booking_Agent> readBooking_Agents() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM booking_agent", null);
	}
}
