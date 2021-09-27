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
import com.ss.ut.ent.User;

/**
 * @author brandon
 *
 */
public class UserDAO extends BaseDAO {

	public UserDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<User> format(ResultSet data) throws SQLException {
		List<User> users = new ArrayList<User>();
		
		while(data.next())
		{
			users.add(new User(data.getInt("id"), data.getInt("role_id"), data.getString("given_name"), data.getString("family_name"), data.getString("username"), data.getString("email"), data.getString("password"), data.getString("phone")));
		}
		
		return users;
	}
	
	public void insertUser(User user) throws SQLException
	{
		write("INSERT INTO airplane (role_id, given_name, family_name, username, email, password, phone) values (?, ?, ?, ?, ?, ?, ?)", new Object[] {user.getRole_id(), user.getGiven_name(), user.getFamily_name(), user.getUsername(), user.getEmail(), user.getPassword(), user.getPhone()});
	}

	public void updateUser(User user) throws SQLException
	{
		write("UPDATE airplane SET (role_id = ?, given_name = ?, family_name = ?, username = ?, email = ?, password = ?, phone = ?) WHERE (id = ?)", new Object[] {user.getRole_id(), user.getGiven_name(), user.getFamily_name(), user.getUsername(), user.getEmail(), user.getPassword(), user.getPhone(), user.getId()});
	}
	
	public void deleteUser(User user) throws SQLException
	{
		write("DELETE FROM airplane WHERE (id = ?)", new Object[] {user.getId()});
	}
	
	public List <Airplane> readUsers() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM airplane", null);
	}
}
