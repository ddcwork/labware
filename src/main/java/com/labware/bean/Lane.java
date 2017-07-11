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
public class Lane extends Container {

	private long id;

	private List<Sample> taggedSample;

	private QC qc;

	public enum QC {
		PASS, FAIL
	}

	public Lane() {

	}

	public Lane(List<Sample> taggedSample) {

		this.taggedSample = taggedSample;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Sample> getTaggedSample() {
		return taggedSample;
	}

	public void setTaggedSample(List<Sample> taggedSample) {
		this.taggedSample = taggedSample;
	}

	public QC getQc() {
		return qc;
	}

	public void setQc(QC qc) {
		this.qc = qc;
	}

}
