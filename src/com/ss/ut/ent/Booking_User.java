/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Booking_User {
	/**
	 * @param booking_id
	 * @param user_id
	 */
	public Booking_User(Integer booking_id, Integer user_id) {
		super();
		this.booking_id = booking_id;
		this.user_id = user_id;
	}
	Integer booking_id;
	Integer user_id;
	/**
	 * @return the booking_id
	 */
	public Integer getBooking_id() {
		return booking_id;
	}
	/**
	 * @param booking_id the booking_id to set
	 */
	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}
	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
}
