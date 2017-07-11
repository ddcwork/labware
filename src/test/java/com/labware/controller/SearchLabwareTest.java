/**
 * 
 */
package com.labware.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.labware.services.SearchService;
import com.labware.validation.ContainerValidation;

/**
 * @author Durga.Chintagunta
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class SearchLabwareTest {

	@InjectMocks
	SearchLabware searchLabware = new SearchLabware();
	
	@Mock
	SearchService searchService;

	@Mock
	ContainerValidation containerValidator;

	MockMvc mockMvc;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(searchLabware).build();
	}

	@Test
	public void given_correct_uri_then_return_success_ok_response() throws Exception {
		// Act & Assertt
		mockMvc.perform(get("/getContainer").param("containerName", "2X5well"))
				.andExpect(status().isOk());
	}

	@Test
	public void given_wrong_uri_then_return_error_404_response() throws Exception {
		// Act & Assertt
		mockMvc.perform(get("/getContainer1").param("containerName", "2X5well"))
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void given_correct_uri_when_incomplete_path_variable_then_return_error() throws Exception {
		// Act & Assertt
		mockMvc.perform(get("/getContainer"))
				.andExpect(status().is4xxClientError());
	}
}
