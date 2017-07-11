/**
 * 
 */
package com.labware.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Durga.Chintagunta
 *
 */
public class LabwareException  extends Exception {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(LabwareException.class);

	public LabwareException(String errorDescription) {
		super(errorDescription);
		logger.error(errorDescription);
	}

}
