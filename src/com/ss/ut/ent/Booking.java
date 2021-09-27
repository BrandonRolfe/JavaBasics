/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Booking {
	/**
	 * @param id
	 * @param is_active
	 * @param confirmation_code
	 */
	public Booking(Integer id, Integer is_active, String confirmation_code) {
		super();
		this.id = id;
		this.is_active = is_active;
		this.confirmation_code = confirmation_code;
	}
	Integer id;
	Integer is_active;
	String confirmation_code;
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
	 * @return the is_active
	 */
	public Integer getIs_active() {
		return is_active;
	}
	/**
	 * @param is_active the is_active to set
	 */
	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}
	/**
	 * @return the confirmation_code
	 */
	public String getConfirmation_code() {
		return confirmation_code;
	}
	/**
	 * @param confirmation_code the confirmation_code to set
	 */
	public void setConfirmation_code(String confirmation_code) {
		this.confirmation_code = confirmation_code;
	}

}
