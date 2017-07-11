/**
 * 
 */
package com.labware.validation;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.labware.exception.LabwareException;

/**
 * @author Durga.Chintagunta
 *
 */
@Component
public class ContainerValidation {
	
	public void validateContainerName(String containerName) throws LabwareException {

		if(StringUtils.isEmpty(containerName)) {
			throw new LabwareException("Container " + containerName + " is mandatory.");
		}
	}

}
