/**
 * 
 */
package com.ss.ut.serv;

import java.sql.Connection;
import java.sql.SQLException;

import com.ss.ut.DAO.AirportDAO;
import com.ss.ut.ent.Airport;

/**
 * @author brandon
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = new ConnectionUtil().getConnection();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		AirportDAO adao = new AirportDAO(conn);
		
		try {
			adao.insertAirport(new Airport("TES", "Test Airport"));
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
