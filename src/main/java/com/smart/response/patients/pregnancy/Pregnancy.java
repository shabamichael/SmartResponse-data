/**
 * 
 */
package com.smart.response.patients.pregnancy;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.smart.response.ambulance.Ambulances;
import com.smart.response.doctors.Doctors;
import com.smart.response.hospital.Hospitals;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Michael Shaba
 *
 */
@Entity
@Table(name="Pregnancy")
@AllArgsConstructor
public @Data class Pregnancy {
	
	
	
	@Id
	private String RegNo;
	private String SA_Id_No;
	private  String firstName;
	private String lastName;
	private long phoneNumber;
	private String email;
	private Date conception;
	private Hospitals hospitalRegNo;
	private Doctors doctorRegNo;
	private Ambulances ambulance;
	
	
	
	

}
