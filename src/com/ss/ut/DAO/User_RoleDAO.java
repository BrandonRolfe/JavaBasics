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
import com.ss.ut.ent.User_Role;

/**
 * @author brandon
 *
 */
public class User_RoleDAO extends BaseDAO {

	public User_RoleDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<User_Role> format(ResultSet data) throws SQLException {
		List<User_Role> user_roles = new ArrayList<User_Role>();
		
		while(data.next())
		{
			user_roles.add(new User_Role(data.getInt("id"), data.getString("name")));
		}
		
		return user_roles;
	}
	
	public void insertUser_Role(User_Role user_role) throws SQLException
	{
		write("INSERT INTO user_role (name) values (?)", new Object[] {user_role.getName()});
	}

	public void updateUser_Role(User_Role user_role) throws SQLException
	{
		write("UPDATE user_role SET name = ? WHERE (id = ?)", new Object[] {user_role.getId(), user_role.getName()});
	}
	
	public void deleteUser_Role(User_Role user_role) throws SQLException
	{
		write("DELETE FROM user_role WHERE (id = ?)", new Object[] {user_role.getId()});
	}
	
	public List <User_Role> readUser_Roles() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM user_role", null);
	}
}
