/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Booking_Payment {
	/**
	 * @param booking_id
	 * @param stripe_id
	 * @param refunded
	 */
	public Booking_Payment(Integer booking_id, String stripe_id, Integer refunded) {
		super();
		this.booking_id = booking_id;
		this.stripe_id = stripe_id;
		this.refunded = refunded;
	}
	Integer booking_id;
	String stripe_id;
	Integer refunded;
	/**
	 * @return the id
	 */
	public Integer getBooking_id() {
		return booking_id;
	}
	/**
	 * @param id the id to set
	 */
	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}
	/**
	 * @return the stripe_id
	 */
	public String getStripe_id() {
		return stripe_id;
	}
	/**
	 * @param stripe_id the stripe_id to set
	 */
	public void setStripe_id(String stripe_id) {
		this.stripe_id = stripe_id;
	}
	/**
	 * @return the refunded
	 */
	public Integer getRefunded() {
		return refunded;
	}
	/**
	 * @param refunded the refunded to set
	 */
	public void setRefunded(Integer refunded) {
		this.refunded = refunded;
	}

}
