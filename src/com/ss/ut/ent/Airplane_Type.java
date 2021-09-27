/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Airplane_Type {
	/**
	 * @param id
	 * @param max_capacity
	 */
	public Airplane_Type(Integer id, Integer max_capacity) {
		super();
		this.id = id;
		this.max_capacity = max_capacity;
	}
	Integer id;
	Integer max_capacity;
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
	 * @return the max_capacity
	 */
	public Integer getMax_capacity() {
		return max_capacity;
	}
	/**
	 * @param max_capacity the max_capacity to set
	 */
	public void setMax_capacity(Integer max_capacity) {
		this.max_capacity = max_capacity;
	}

}
