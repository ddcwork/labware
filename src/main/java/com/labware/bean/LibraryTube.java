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
public class LibraryTube extends Container {

	private long id;

	private String barcode;  //TODO: add validation for barcode should start with NT

	private List<Sample> taggedSamples;

	public LibraryTube() {

	}

	public LibraryTube(List<Sample> taggedSamples) {
		this.taggedSamples = taggedSamples;
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

	public List<Sample> getTaggedSamples() {
		return taggedSamples;
	}

	public void setTaggedSamples(List<Sample> taggedSamples) {
		this.taggedSamples = taggedSamples;
	}

}
