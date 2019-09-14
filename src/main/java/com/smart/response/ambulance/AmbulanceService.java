/**
 * 
 */
package com.smart.response.ambulance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * @author Michael Shaba
 *
 */
@Service
public class AmbulanceService {

	private static Logger LOGGER = Logger.getLogger(AmbulanceService.class.getName());
	

	/*private List<Ambulances> ambulancesList = new ArrayList<>(Arrays.asList(
			new Ambulances("AMB100", "Michael Ambulance Services", "MSAMB009", "0717424906", "shabamich@ambulance.com",
					"082", "Technoparrk Building", "Boulvard", "Midrand", "Johannesburg", "Gauteng")));*/
	@Autowired
	private AmbulanceRepository ambulanceRepository;

	public List<Ambulances> FindAllAmbulances() {

			
		  List<Ambulances> ambulances = new ArrayList<>();
		  ambulanceRepository.findAll().forEach(ambulances::add); return ambulances;
		 
	}

	public Optional<Ambulances> FindOneAmbulanceById(String id) {
		return ambulanceRepository.findById(id);

	}

	public void CreateNewAmbulance(Ambulances ambulance) {
		ambulanceRepository.save(ambulance);
		LOGGER.info(ambulance.getambulanceName() + " --  have been successfully created a new ambulance service");
	}

	public void UpdateAmbulance(String id, Ambulances ambulance) {
		ambulanceRepository.save(ambulance);
		LOGGER.info("Successfully updated an Ambulance services... with id :- " + id);
	}

	public void DeleteAmbulanceById(String id) {
		ambulanceRepository.deleteById(id);
		LOGGER.info(id + "Ambulance object has been deleted");
	}

}
