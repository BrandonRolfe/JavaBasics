/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Passenger {
	/**
	 * @param id
	 * @param booking_id
	 * @param given_name
	 * @param family_name
	 * @param dob
	 * @param gender
	 * @param address
	 */
	public Passenger(Integer id, Integer booking_id, String given_name, String family_name, String dob, String gender,
			String address) {
		super();
		this.id = id;
		this.booking_id = booking_id;
		this.given_name = given_name;
		this.family_name = family_name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}
	Integer id;
	Integer booking_id;
	String given_name;
	String family_name;
	String dob;
	String gender;
	String address;
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
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
