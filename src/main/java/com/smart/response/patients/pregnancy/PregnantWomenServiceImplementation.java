package com.smart.response.patients.pregnancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.response.hospital.Hospitals;

@Service
public class PregnantWomenServiceImplementation implements PregnantWomenService {
	private static  int No_of_feutus;
	
		
	@Autowired
	private final  PregnancyRepository pregnancyRepository;
			
	/**
	 * @param pregnancyRepository
	 */
	public PregnantWomenServiceImplementation(PregnancyRepository pregnancyRepository) {
		this.pregnancyRepository = pregnancyRepository;
	}

	@Override
	public Pregnancy findPregnantWomenById(String id) {
			return pregnancyRepository.getOne(id);
	}

	@Override
	public List<Pregnancy> findAllPregnantWomen() {
			return pregnancyRepository.findAll();
	}

	@Override
	public Pregnancy SavePregnantWoman(Pregnancy pregnantWoman) {
			return pregnancyRepository.save(pregnantWoman);
	}

	@Override
	public Pregnancy LoadPregnantWomanHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ShowDueDate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pregnancy UpdatePregnancyComments() {
		// TODO Auto-generated method stub
		return null;
	}



	
		


	
}
