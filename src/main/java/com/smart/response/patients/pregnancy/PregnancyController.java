/**
 * 
 */
package com.smart.response.patients.pregnancy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Michael Shaba
 *
 */
@RestController
@RequestMapping(PregnancyController.BASE_URL)
public class PregnancyController {
	
	public static final String BASE_URL = "/api/v1/pregnantwomen";
	
	@Autowired
	private PregnantWomenService pregnantWomenService;

	@RequestMapping("/")
	public String home() {
		return "<h2>Welcome to the Pregnancy system Application</h2>";
		
	}
	
	/**
	 * @param pregnantWomenService
	 */
	public PregnancyController(PregnantWomenService pregnantWomenService) {
		this.pregnantWomenService = pregnantWomenService;
	}

	
	@RequestMapping("/pregnancies")
	public List<Pregnancy>GetAllPregnantWomen(){
		return pregnantWomenService.findAllPregnantWomen();
	}
	
	@RequestMapping("/{id}")
	public Pregnancy GetPregnantWomanById(@PathVariable String id) {
		return pregnantWomenService.findPregnantWomenById(id);
		
	}
	
	@PostMapping("/pregnancy")
	@ResponseStatus(HttpStatus.CREATED)
	public Pregnancy CreatePregnantWoman(@RequestBody Pregnancy pregnantWoman) {
		return pregnantWomenService.SavePregnantWoman(pregnantWoman);
		
	}
	
}
