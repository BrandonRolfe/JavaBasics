/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Booking_Agent {
	/**
	 * @param booking_id
	 * @param agent_id
	 */
	public Booking_Agent(Integer booking_id, Integer agent_id) {
		super();
		this.booking_id = booking_id;
		this.agent_id = agent_id;
	}
	Integer booking_id;
	Integer agent_id;
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
	 * @return the agent_id
	 */
	public Integer getAgent_id() {
		return agent_id;
	}
	/**
	 * @param agent_id the agent_id to set
	 */
	public void setAgent_id(Integer agent_id) {
		this.agent_id = agent_id;
	}

}
