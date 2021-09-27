/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Flight_Bookings {
	/**
	 * @param flight_id
	 * @param booking_id
	 */
	public Flight_Bookings(Integer flight_id, Integer booking_id) {
		super();
		this.flight_id = flight_id;
		this.booking_id = booking_id;
	}
	Integer flight_id;
	Integer booking_id;
	/**
	 * @return the flight_id
	 */
	public Integer getFlight_id() {
		return flight_id;
	}
	/**
	 * @param flight_id the flight_id to set
	 */
	public void setFlight_id(Integer flight_id) {
		this.flight_id = flight_id;
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

}
