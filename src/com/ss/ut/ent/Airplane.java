/**
 * 
 */
package com.ss.ut.ent;

/**
 * @author brandon
 *
 */
public class Airplane {
	/**
	 * @param id
	 * @param type_id
	 */
	public Airplane(Integer id, Integer type_id) {
		super();
		this.id = id;
		this.type_id = type_id;
	}
	Integer id;
	Integer type_id;
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
	 * @return the type_id
	 */
	public Integer getType_id() {
		return type_id;
	}
	/**
	 * @param type_id the type_id to set
	 */
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

}
