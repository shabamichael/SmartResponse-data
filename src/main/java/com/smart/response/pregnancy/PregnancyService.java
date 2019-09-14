/**
 * 
 */
package com.smart.response.pregnancy;

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
public class PregnancyService {

	@Autowired
	private PregnancyRepository  pregnancyRepository;
	
	public Pregnancy pregnancy1 =  new Pregnancy();
	
		
	public List<Pregnancy> FindAllPregnancy() {
	//return hospitalList;
		List<Pregnancy>pregnancy = new ArrayList<>();
		pregnancyRepository.findAll().forEach(pregnancy::add);
		
		return pregnancy;
	}
	
	
	public Pregnancy FindOnePregnancyById(long id) {
		return pregnancyRepository.findById(id).get();
		
		}
	
	public void CreateNewPregnancy(Pregnancy pregnancy) {
		pregnancyRepository.save(pregnancy);
	}

	public void UpdatePregnancy(long id, Pregnancy pregnancy) {
		
		pregnancyRepository.save(pregnancy);
	}

	public void DeletePregnancyById(long id) {
		pregnancyRepository.deleteById(id);
	}
	
}
