/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Flight {
	/**
	 * @param id
	 * @param route_id
	 * @param airplane_id
	 * @param departure_time
	 * @param reserved_seats
	 * @param seat_price
	 */
	public Flight(Integer id, Integer route_id, Integer airplane_id, String departure_time, Integer reserved_seats,
			Float seat_price) {
		super();
		this.id = id;
		this.route_id = route_id;
		this.airplane_id = airplane_id;
		this.departure_time = departure_time;
		this.reserved_seats = reserved_seats;
		this.seat_price = seat_price;
	}
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	public Flight(int id) {
		this.id = id;
	}
	Integer id;
	Integer route_id;
	Integer airplane_id;
	String departure_time;
	Integer reserved_seats;
	Float seat_price;
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
	 * @return the route_id
	 */
	public Integer getRoute_id() {
		return route_id;
	}
	/**
	 * @param route_id the route_id to set
	 */
	public void setRoute_id(Integer route_id) {
		this.route_id = route_id;
	}
	/**
	 * @return the airplane_id
	 */
	public Integer getAirplane_id() {
		return airplane_id;
	}
	/**
	 * @param airplane_id the airplane_id to set
	 */
	public void setAirplane_id(Integer airplane_id) {
		this.airplane_id = airplane_id;
	}
	/**
	 * @return the departure_time
	 */
	public String getDeparture_time() {
		return departure_time;
	}
	/**
	 * @param departure_time the departure_time to set
	 */
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	/**
	 * @return the reserved_seats
	 */
	public Integer getReserved_seats() {
		return reserved_seats;
	}
	/**
	 * @param reserved_seats the reserved_seats to set
	 */
	public void setReserved_seats(Integer reserved_seats) {
		this.reserved_seats = reserved_seats;
	}
	/**
	 * @return the seat_price
	 */
	public Float getSeat_price() {
		return seat_price;
	}
	/**
	 * @param seat_price the seat_price to set
	 */
	public void setSeat_price(Float seat_price) {
		this.seat_price = seat_price;
	}

}
