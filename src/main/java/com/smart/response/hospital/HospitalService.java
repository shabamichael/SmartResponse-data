/**
 * 
 */
package com.smart.response.hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Michael Shaba
 *
 *
 */
@Service
public class HospitalService {

	@Autowired
	private HospitalRepository  hospitalRepository;
	
	public Hospitals hospital1 =  new Hospitals();
	
		
	public List<Hospitals> FindAllHospitals() {
	//return hospitalList;
		List<Hospitals>hospitals = new ArrayList<>();
		hospitalRepository.findAll().forEach(hospitals::add);
		
		return hospitals;
	}
	
	
	public Hospitals FindOneHospitalById(long id) {
		return hospitalRepository.findById(id).get();
		
		//return 	hospitalList.stream().filter
	//(hospi -> hospi.getHospitalId().equalsIgnoreCase(id)).findFirst().get();
	/*
		for(Hospitals hosp : hospitalList) {
			if (hosp.getHospitalId()== id) {
				System.out.println(hosp.toString());
				return hosp;
			}
		}
		return null;
		*/	
	}
	
	public void CreateNewHospital(Hospitals hospital) {
		//hospitalList.add(hospital);
		hospitalRepository.save(hospital);
	}

	public void UpdateHospital(long id, Hospitals hospital) {
		/*
		 * for(int i=0; i < hospitalList.size(); i++) { hospital1 = hospitalList.get(i)
		 * ; if (hospital.getHospitalId().equalsIgnoreCase(id)) { hospitalList.set(i,
		 * hospital); return; } }
		 */
		hospitalRepository.save(hospital);
	}

	public void DeleteHospitalById(long id) {
		// hospitalList.removeIf(hosp -> hosp.getHospitalId().equals(id));
		hospitalRepository.deleteById(id);
	}
	
}
