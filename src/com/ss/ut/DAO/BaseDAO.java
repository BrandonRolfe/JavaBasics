/**
 * 
 */
package com.ss.ut.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author brandon
 *
 */
public abstract class BaseDAO <T> {
	
	protected static Connection conn = null;
	
	public BaseDAO(Connection conn) {
		this.conn = conn;
	}
	
	protected void write(String statement, Object[] data) throws SQLException
	{
		PreparedStatement preparedWrite = conn.prepareStatement(statement);
		
		if(data != null)
		{
			for(Integer i = 0; i < data.length; i++)
			{
				preparedWrite.setObject((i + 1), data[i]);
			}
		}
		
		preparedWrite.execute();
	}
	
	protected List <T> read(String statement, Object[] data) throws SQLException, ClassNotFoundException
	{
		PreparedStatement preparedRead = conn.prepareStatement(statement);
		
		if(data != null)
		{
			for(Integer i = 0; i < data.length; i++)
			{
				preparedRead.setObject((i + 1), data[i]);
			}
		}
		return format(preparedRead.executeQuery());
	}
	
	abstract protected List <T> format(ResultSet data)  throws SQLException, ClassNotFoundException;
}
