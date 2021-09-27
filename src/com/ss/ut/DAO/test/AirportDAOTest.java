/**
 * 
 */
package com.ss.ut.DAO.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ss.ut.DAO.AirportDAO;
import com.ss.ut.DAO.FlightDAO;
import com.ss.ut.ent.Airport;
import com.ss.ut.ent.Flight;

/**
 * @author brandon
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AirportDAOTest {

	Connection conn;
	AirportDAO adao;
	
	/*
	@Test
	public void AinsertFlightTest() throws ClassNotFoundException, SQLException {
		conn = new ConnectionUtil().getConnection();
		adao = new AirportDAO(conn);
		
		adao.insertAirport(new Airport("TEX", "TestTestPort"));
		conn.commit();
		//Float tempF = (adao.checkFlight(new Flight(9999)).get(0).getSeat_price());
		//assertEquals(tempF.toString(), "49.99");
	}
	
	@Test
	public void BupdateFlightTest() throws ClassNotFoundException, SQLException {
		conn = new ConnectionUtil().getConnection();
		fdao = new FlightDAO(conn);
		
		fdao.updateFlight(new Flight(9999, 1, 1, "2014-06-1 08:00:00", 0, 99.99f));
		conn.commit();
		Float tempF = (fdao.checkFlight(new Flight(9999)).get(0).getSeat_price());
		assertEquals(tempF.toString(), "99.99");
	}
	
	@Test
	public void CdeleteFlightTest() throws ClassNotFoundException, SQLException {
		conn = new ConnectionUtil().getConnection();
		fdao = new FlightDAO(conn);
		
		fdao.deleteFlight(new Flight(9999));
		conn.commit();
		assertTrue(fdao.checkFlight(new Flight(9999)).isEmpty());
	}
	*/
}
