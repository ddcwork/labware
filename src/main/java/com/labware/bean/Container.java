/**
 * 
 */
package com.labware.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Durga.Chintagunta
 *
 */

@Component
public class Container extends Labware {

	private long id;

	private List<Sample> samples; // TODO: Cannot contain two samples with the
									// same tag, can add constrain in DB for not
									// to having duplicated tags for samples

	private String location;

	private String barcode; // optional filed in DB

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Sample> getSamples() {
		return samples;
	}

	public void setSamples(List<Sample> samples) {
		this.samples = samples;
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

	/** Samples can be copied from one container to another
	 * 
	 * @param newContainer
	 * @return modified Container
	 */
	public Container copySamplesToOtherConatiner(Container newContainer) {

		ArrayList<Sample> copiedSamples = new ArrayList<Sample>();
		copiedSamples.addAll(this.samples);

		newContainer.setSamples(copiedSamples);
		return newContainer;
	}

}
