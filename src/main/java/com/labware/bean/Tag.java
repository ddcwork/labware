/**
 * 
 */
package com.labware.bean;

import java.util.UUID;

import org.springframework.stereotype.Component;

/**
 * @author Durga.Chintagunta
 *
 */
@Component
public class Tag {

	private String id;

	public Tag() {

		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
