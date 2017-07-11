/**
 * 
 */
package com.labware.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.labware.exception.LabwareException;

/**
 * @author Durga.Chintagunta
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ContainerValidationTest {

	@InjectMocks
	ContainerValidation containerValidation = new ContainerValidation();
	

	@Test
	public void test_validateContainerName_success() {
		try {
			// Act
			containerValidation.validateContainerName("2X5well");
		} catch (LabwareException e) {
			// Assert
			fail();
		}
	}

	@Test
	public void test_validateContainerName_fail() {
		try {
			// Act
			containerValidation.validateContainerName(null);
			// Assert
			fail();
		} catch (LabwareException e) {
			// Assert
			assertEquals("Container null is mandatory.", e.getMessage());
		}
	}

}
