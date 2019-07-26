/**
 * 
 */
package com.smart.response.patients.pregnancy;

import java.util.List;

/**
 * @author Michael Shaba
 *
 */
public interface PregnantWomenService {
	
	public Pregnancy findPregnantWomenById(String id);
	
	public List<Pregnancy>findAllPregnantWomen();

	public Pregnancy SavePregnantWoman(Pregnancy pregnantWoman);
	
	public Pregnancy LoadPregnantWomanHistory();
	
	public void ShowDueDate();
	
	public Pregnancy UpdatePregnancyComments();
	
	
	
}
