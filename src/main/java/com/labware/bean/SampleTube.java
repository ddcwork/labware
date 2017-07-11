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
public class SampleTube extends Container {

	private long id;

	private String barcode; //TODO: add validation for barcode should start with NT

	private Sample untaggedSample;

	public SampleTube() {

	}

	public SampleTube(Sample untaggedSample) {
		this.untaggedSample = untaggedSample;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Sample getUntaggedSample() {
		return untaggedSample;
	}

	public void setUntaggedSample(Sample untaggedSample) {
		this.untaggedSample = untaggedSample;
	}

}
