/**
 * 
 */
package com.smart.response.pregnancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Michael Shaba
 * @category Smart Response UJ Project
 * 
 *
 */
@RestController
@RequestMapping(PregnancyController.BASE_URL)
public class PregnancyController {

	public static final String BASE_URL = "/api/v1/pregnancy";
	
	@Autowired
	private PregnancyService pregnancyService;
	
	@RequestMapping("/")
	public String home() {
		return "<h2>Welcome to the Pregnancy section of the Rest API</h2>";
		
	}

	// Return all Pregnancy in the database
	@RequestMapping("/pregnancy")
	public List<Pregnancy> GetAllPregnancy() {
		return pregnancyService.FindAllPregnancy();

	}

	// Return Just one Pregnancy by ID
	@RequestMapping("/pregnancy/{id}")
	public Pregnancy GetOnePregnancyById(@PathVariable long id) {
		return pregnancyService.FindOnePregnancyById(id);
	}

	// Add a New Pregnancy
	@RequestMapping(method = RequestMethod.POST, value = "/pregnancy")
	public void AddNewPregnancy(@RequestBody Pregnancy pregnancy) {
		pregnancyService.CreateNewPregnancy(pregnancy);

	}

	// Update an existing Pregnancy
	@RequestMapping(method = RequestMethod.PUT, value = "/pregnancy/{id}")
	public void UpdateExistingPregnancy(@PathVariable long id, @RequestBody Pregnancy pregnancy) {
		pregnancyService.UpdatePregnancy(id, pregnancy);

	}

	// Deletes an Pregnancy from the list
	@RequestMapping(method = RequestMethod.DELETE, value = "/pregnancy/{id}")
	public void DeletePregnancy(@PathVariable long id) {
		pregnancyService.DeletePregnancyById(id);

	}
}
