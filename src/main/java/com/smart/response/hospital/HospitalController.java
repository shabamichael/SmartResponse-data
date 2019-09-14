/**
 * 
 */
package com.smart.response.hospital;

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
@RequestMapping(HospitalController.BASE_URL)
public class HospitalController {

	public static final String BASE_URL = "/api/v1/hospitals";
	
	@Autowired
	private HospitalService hospitalService;
	
	@RequestMapping("/")
	public String home() {
		return "<h2>Welcome to the Hospitals section of the Rest API</h2>";
		
	}

	// Return all Hospitals in the database
	@RequestMapping("/hospitals")
	public List<Hospitals> GetAllHospitals() {
		return hospitalService.FindAllHospitals();

	}

	// Return Just one Hospital by ID
	@RequestMapping("/hospitals/{id}")
	public Hospitals GetOneHospitalById(@PathVariable long id) {
		return hospitalService.FindOneHospitalById(id);
	}

	// Add a New Hospital
	@RequestMapping(method = RequestMethod.POST, value = "/hospitals")
	public void AddNewHospital(@RequestBody Hospitals hospital) {
		hospitalService.CreateNewHospital(hospital);

	}

	// Update an existing Hospital
	@RequestMapping(method = RequestMethod.PUT, value = "/hospitals/{id}")
	public void UpdateExistingHospital(@PathVariable long id, @RequestBody Hospitals hospital) {
		hospitalService.UpdateHospital(id, hospital);

	}

	// Deletes an Hospital from the list
	@RequestMapping(method = RequestMethod.DELETE, value = "/hospitals/{id}")
	public void DeleteHospital(@PathVariable long id) {
		hospitalService.DeleteHospitalById(id);

	}
}
