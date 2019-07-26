/**
 * 
 */
package com.smart.response.ambulance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Michael Shaba
 *
 */
@Service
public class AmbulanceService {

	@Autowired
	private AmbulanceRepository ambulanceRepository;

	public List<Ambulances> FindAllAmbulances() {
		List<Ambulances> ambulances = new ArrayList<>();
		ambulanceRepository.findAll().forEach(ambulances::add);
		return ambulances;
	}

	public Optional<Ambulances> FindOneAmbulanceById(String id) {
		return ambulanceRepository.findById(id);

	}

	public void CreateNewAmbulance(Ambulances ambulance) {
				ambulanceRepository.save(ambulance);
	}

	public void UpdateAmbulance(String id, Ambulances ambulance) {
		ambulanceRepository.save(ambulance);
	}

	public void DeleteAmbulanceById(String id) {
		ambulanceRepository.deleteById(id);
	}

}
