/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Airport {
	/**
	 * @param iata_id
	 * @param city
	 */
	public Airport(String iata_id, String city) {
		super();
		this.iata_id = iata_id;
		this.city = city;
	}
	public Airport(String iata_id) {
		this.iata_id = iata_id;
	}
	public Airport() {
		// TODO Auto-generated constructor stub
	}
	String iata_id;
	String city;

	/**
	 * @return the iata_id
	 */
	public String getIata_id() {
		return iata_id;
	}
	/**
	 * @param iata_id the iata_id to set
	 */
	public void setIata_id(String iata_id) {
		this.iata_id = iata_id;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	

}
