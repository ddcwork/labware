/**
 * 
 */
package com.labware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.labware.bean.Container;
import com.labware.exception.LabwareException;
import com.labware.services.SearchService;
import com.labware.validation.ContainerValidation;

/**
 * @author Durga.Chintagunta
 *
 */
@RestController
public class SearchLabware {

	@Autowired
	SearchService searchService;

	@Autowired
	ContainerValidation containerValidator;

	//http://localhost:8080/labware/getContainer?containerName=9X10well
	// Assuming, containerName=9X10well in request URL; well represented with its x and y
	// indices in search as it does not contain name or barcode etc
	@RequestMapping(value = "/getContainer", method = RequestMethod.GET)
	@ResponseBody
	public Container getContainer(@RequestParam("containerName") String containerName) throws LabwareException {

		containerValidator.validateContainerName(containerName);

		return searchService.getContainer(containerName);
	}

}
