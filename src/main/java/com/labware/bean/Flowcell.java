/**
 * 
 */
package com.labware.bean;

import org.springframework.stereotype.Component;

/**
 * @author Durga.Chintagunta
 *
 */
@Component
public class Flowcell extends Labware {

	private long id;

	private Lane[] lanes;

	public enum Type {
		TWO(2), EIGHT(8);

		private int number;

		private Type(int number) {
			this.number = number;
		}

		public int getNumber() {
			return this.number;
		}
	}

	public Flowcell() {

	}

	public Flowcell(Type type) {

		lanes = new Lane[type.getNumber()];
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Lane[] getLanes() {
		return lanes;
	}

	public void setLanes(Lane[] lanes) {
		this.lanes = lanes;
	}

}
