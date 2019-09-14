/**
 * 
 */
package com.smart.response.ambulance;

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

import com.smart.response.hospital.HospitalController;

/**
 * @author Michael Shaba
 * @category Smart Response UJ Project
 * Ambulance Details POJO
 * 
 *
 */

@RestController
@RequestMapping(AmbulanceController.BASE_URL)
public class AmbulanceController {
	
	public static final String BASE_URL = "/api/v1/ambulances";

	

	@Autowired
	private AmbulanceService ambulanceService;
	
	@RequestMapping("/")
	public String home() {
		return "<h2>Welcome to the Ambulances section of the Emergency Response Rest API</h2>";
		
	}

	// Return all Ambulances in the database
	@RequestMapping("/ambulances")
	public List<Ambulances> GetAllambulances() {
		return ambulanceService.FindAllAmbulances();

	}

	// Return Just one Ambulance by ID
	@RequestMapping("/ambulances/{id}")
	public Optional<Ambulances> GetOneAmbulanceById(@PathVariable String id) {
		return ambulanceService.FindOneAmbulanceById(id);
	}

	// Add a New Hospital
	@RequestMapping(method = RequestMethod.POST, value = "/ambulances")
	public void AddNewAmbulance(@RequestBody Ambulances ambulance) {
		ambulanceService.CreateNewAmbulance(ambulance);

	}

	// Update an existing Ambulance
	@RequestMapping(method = RequestMethod.PUT, value = "/ambulances/{id}")
	public void UpdateExistingAmbulances(@PathVariable String id, @RequestBody Ambulances ambulance) {
		ambulanceService.UpdateAmbulance(id, ambulance);

	}

	// Deletes an Ambulance from the list																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
	@RequestMapping(method = RequestMethod.DELETE, value = "/ambulances/{id}")
	public void DeleteAmbulance(@PathVariable String id) {
		ambulanceService.DeleteAmbulanceById(id);

	}
}
