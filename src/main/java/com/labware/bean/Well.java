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
public class Well extends Container {

	private long id;

	private int xIndex;

	private int yIndex;

	public Well() {

	}

	public Well(int xIndex, int yIndex) {

		this.xIndex = xIndex;
		this.yIndex = yIndex;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getxIndex() {
		return xIndex;
	}

	public void setxIndex(int xIndex) {
		this.xIndex = xIndex;
	}

	public int getyIndex() {
		return yIndex;
	}

	public void setyIndex(int yIndex) {
		this.yIndex = yIndex;
	}

}
