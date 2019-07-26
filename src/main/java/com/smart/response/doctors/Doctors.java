/**
 * 
 */
package com.smart.response.doctors;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.smart.response.ambulance.Ambulances;
import com.smart.response.hospital.Hospitals;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Michael Shaba
 *
 */

@Entity
@Table(name="Doctors")
@AllArgsConstructor
public @Data class Doctors implements Serializable{

	private Hospitals hospital;
	
	@Id
	private String doctorRegNo;
	private String firstName;
	private long phoneNumber;
	private String email;
	

}
