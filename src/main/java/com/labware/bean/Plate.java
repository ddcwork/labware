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
public class Plate extends Labware {

	private long id;

	private Well[][] wells = new Well[8][12];// considered 96 wells [8][12] //
												// or for 384 wells it should be
												// [16][24]

	private String barcode; //TODO: add validation for barcode should start with DN

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Well[][] getWells() {
		return wells;
	}

	public void setWells(Well[][] wells) {
		this.wells = wells;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}
