/**
 * 
 */
package com.labware.dao;

import org.springframework.stereotype.Component;

import com.labware.bean.Well;

/**
 * @author Durga.Chintagunta
 *
 */
@Component
public class WellDao {

	public Well getWellDetailsByIndices(int xIndex, int yIndex){
			
		//TODO: make a DB call for finding Well, with given indices   
		return new Well(xIndex, yIndex);
	}
}
