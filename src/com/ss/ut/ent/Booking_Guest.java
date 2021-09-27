/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Booking_Guest {
	/**
	 * @param booking_id
	 * @param contact_email
	 * @param contact_phone
	 */
	public Booking_Guest(Integer booking_id, String contact_email, String contact_phone) {
		super();
		this.booking_id = booking_id;
		this.contact_email = contact_email;
		this.contact_phone = contact_phone;
	}
	Integer booking_id;
	String contact_email;
	String contact_phone;
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
	 * @return the contact_email
	 */
	public String getContact_email() {
		return contact_email;
	}
	/**
	 * @param contact_email the contact_email to set
	 */
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	/**
	 * @return the contact_phone
	 */
	public String getContact_phone() {
		return contact_phone;
	}
	/**
	 * @param contact_phone the contact_phone to set
	 */
	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}

}
