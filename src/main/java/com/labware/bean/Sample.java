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
public class Sample {

	private String id;

	private Tag tag;

	public Sample() {

	}

	public Sample(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public void createTag() {
		tag = new Tag();
	}

}
