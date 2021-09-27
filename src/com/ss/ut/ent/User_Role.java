/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class User_Role {
	/**
	 * @param id
	 * @param name
	 */
	public User_Role(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	Integer id;
	String name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
