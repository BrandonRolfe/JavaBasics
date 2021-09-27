/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class User {
	/**
	 * @param id
	 * @param role_id
	 * @param given_name
	 * @param family_name
	 * @param username
	 * @param email
	 * @param password
	 * @param phone
	 */
	public User(Integer id, Integer role_id, String given_name, String family_name, String username, String email,
			String password, String phone) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.given_name = given_name;
		this.family_name = family_name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id) {
		this.id = id;
	}
	public User(Integer id, Integer role_id, String given_name, String family_name, String username, String email,
			String phone) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.given_name = given_name;
		this.family_name = family_name;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}
	Integer id;
	Integer role_id;
	String given_name;
	String family_name;
	String username;
	String email;
	String password;
	String phone;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the role_id
	 */
	public Integer getRole_id() {
		return role_id;
	}
	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	/**
	 * @return the given_name
	 */
	public String getGiven_name() {
		return given_name;
	}
	/**
	 * @param given_name the given_name to set
	 */
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	/**
	 * @return the family_name
	 */
	public String getFamily_name() {
		return family_name;
	}
	/**
	 * @param family_name the family_name to set
	 */
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
