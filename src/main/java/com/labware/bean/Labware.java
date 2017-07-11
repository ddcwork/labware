/**
 * 
 */
package com.labware.bean;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Durga.Chintagunta
 *
 */

@Component
public class Labware {

	private long id;

	private String location; // can be changed

	private String barcode;

	private List<Container> containers;

	private State state = State.PENDING;

	public enum State {
		PENDING, STARTED, PASSED, FAILED
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public List<Container> getContainers() {
		return containers;
	}

	public void setContainers(List<Container> containers) {
		this.containers = containers;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
