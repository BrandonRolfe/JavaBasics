/**
 * 
 */
package com.ss.ut.DAO.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author brandon
 *
 */
public class ConnectionUtil {
	
	public final String driver = "com.mysql.cj.jdbc.Driver";
	public final String url = "jdbc:mysql://localhost/utopia";
	public final String username = "root";
	public final String password = "RootSQLp1";

	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver); 
		Connection conn = DriverManager.getConnection(url, username, password);
		conn.setAutoCommit(Boolean.FALSE);
		return conn;
	}

}
