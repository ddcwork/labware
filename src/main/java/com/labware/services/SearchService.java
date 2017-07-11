/**
 * 
 */
package com.labware.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.labware.bean.Container;
import com.labware.dao.WellDao;

/**
 * @author Durga.Chintagunta
 *
 */
@Component
public class SearchService {

	@Autowired
	WellDao wellDao;
	
	/**
	 * @param containerId
	 * @return
	 */
	public Container getContainer(String containerName) {
		
		containerName = containerName.trim().toLowerCase();
		
		if(containerName.contains("well")) {
			
			String[] wellIndices = containerName.split("well");
			String[] indices =  wellIndices[0].split("x");
			
			return wellDao.getWellDetailsByIndices(Integer.parseInt(indices[0]), Integer.parseInt(indices[1]));
		}
		
		return null;
	}

}
