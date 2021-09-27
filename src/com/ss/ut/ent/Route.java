/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Route {
	
	/**
	 * @param id
	 * @param origin_id
	 * @param destination_id
	 */
	public Route(Integer id, String origin_id, String destination_id) {
		super();
		this.id = id;
		this.origin_id = origin_id;
		this.destination_id = destination_id;
	}
	public Route() {
		// TODO Auto-generated constructor stub
	}
	Integer id;
	String origin_id;
	String destination_id;
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
	 * @return the origin_id
	 */
	public String getOrigin_id() {
		return origin_id;
	}
	/**
	 * @param origin_id the origin_id to set
	 */
	public void setOrigin_id(String origin_id) {
		this.origin_id = origin_id;
	}
	/**
	 * @return the destination_id
	 */
	public String getDestination_id() {
		return destination_id;
	}
	/**
	 * @param destination_id the destination_id to set
	 */
	public void setDestination_id(String destination_id) {
		this.destination_id = destination_id;
	}

}
