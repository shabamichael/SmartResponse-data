/**
 * 
 */
package com.smart.response.hospital;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Michael Shaba
 *
 */
@Entity
@Table(name="hospitals")

public class Hospitals implements Serializable{
	
	@Id

	@SequenceGenerator(
			name="hosp_seq", initialValue = 1000, allocationSize=100 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "hosp_seq")
	@Column(name="hospitalId", updatable=false, nullable=false )
	private long hospitalId;
	private String hospitalName;
	private String hospitalRegNo;
	private String hospitalPhoneNo;
	private String hospitalEmail;
	private String hospitalAddress1;
	private String hospitalAddress2;
	private String hospitalAddress3;
	private String hospitalSurburb;
	private String hospitalCity;
	private String hospitalProvince;
	

	/**
	 * 
	 */
	public Hospitals() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param hospitalId
	 * @param hospitalName
	 * @param hospitalRegNo
	 * @param hospitalPhoneNo
	 * @param hospitalEmail
	 * @param hospitalAddress1
	 * @param hospitalAddress2
	 * @param hospitalAddress3
	 * @param hospitalSurburb
	 * @param hospitalCity
	 * @param hospitalProvince
	 */
	public Hospitals(long hospitalId, String hospitalName, String hospitalRegNo, String hospitalPhoneNo,
			String hospitalEmail, String hospitalAddress1, String hospitalAddress2, String hospitalAddress3,
			String hospitalSurburb, String hospitalCity, String hospitalProvince) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalRegNo = hospitalRegNo;
		this.hospitalPhoneNo = hospitalPhoneNo;
		this.hospitalEmail = hospitalEmail;
		this.hospitalAddress1 = hospitalAddress1;
		this.hospitalAddress2 = hospitalAddress2;
		this.hospitalAddress3 = hospitalAddress3;
		this.hospitalSurburb = hospitalSurburb;
		this.hospitalCity = hospitalCity;
		this.hospitalProvince = hospitalProvince;
	}


	/**
	 * @return the hospitalId
	 */
	public long getHospitalId() {
		return hospitalId;
	}


	/**
	 * @param hospitalId the hospitalId to set
	 */
	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}


	/**
	 * @return the hospitalName
	 */
	public String getHospitalName() {
		return hospitalName;
	}


	/**
	 * @param hospitalName the hospitalName to set
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}


	/**
	 * @return the hospitalRegNo
	 */
	public String getHospitalRegNo() {
		return hospitalRegNo;
	}


	/**
	 * @param hospitalRegNo the hospitalRegNo to set
	 */
	public void setHospitalRegNo(String hospitalRegNo) {
		this.hospitalRegNo = hospitalRegNo;
	}


	/**
	 * @return the hospitalPhoneNo
	 */
	public String getHospitalPhoneNo() {
		return hospitalPhoneNo;
	}


	/**
	 * @param hospitalPhoneNo the hospitalPhoneNo to set
	 */
	public void setHospitalPhoneNo(String hospitalPhoneNo) {
		this.hospitalPhoneNo = hospitalPhoneNo;
	}


	/**
	 * @return the hospitalEmail
	 */
	public String getHospitalEmail() {
		return hospitalEmail;
	}


	/**
	 * @param hospitalEmail the hospitalEmail to set
	 */
	public void setHospitalEmail(String hospitalEmail) {
		this.hospitalEmail = hospitalEmail;
	}


	/**
	 * @return the hospitalAddress1
	 */
	public String getHospitalAddress1() {
		return hospitalAddress1;
	}


	/**
	 * @param hospitalAddress1 the hospitalAddress1 to set
	 */
	public void setHospitalAddress1(String hospitalAddress1) {
		this.hospitalAddress1 = hospitalAddress1;
	}


	/**
	 * @return the hospitalAddress2
	 */
	public String getHospitalAddress2() {
		return hospitalAddress2;
	}


	/**
	 * @param hospitalAddress2 the hospitalAddress2 to set
	 */
	public void setHospitalAddress2(String hospitalAddress2) {
		this.hospitalAddress2 = hospitalAddress2;
	}


	/**
	 * @return the hospitalAddress3
	 */
	public String getHospitalAddress3() {
		return hospitalAddress3;
	}


	/**
	 * @param hospitalAddress3 the hospitalAddress3 to set
	 */
	public void setHospitalAddress3(String hospitalAddress3) {
		this.hospitalAddress3 = hospitalAddress3;
	}


	/**
	 * @return the hospitalSurburb
	 */
	public String getHospitalSurburb() {
		return hospitalSurburb;
	}


	/**
	 * @param hospitalSurburb the hospitalSurburb to set
	 */
	public void setHospitalSurburb(String hospitalSurburb) {
		this.hospitalSurburb = hospitalSurburb;
	}


	/**
	 * @return the hospitalCity
	 */
	public String getHospitalCity() {
		return hospitalCity;
	}


	/**
	 * @param hospitalCity the hospitalCity to set
	 */
	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}


	/**
	 * @return the hospitalProvince
	 */
	public String getHospitalProvince() {
		return hospitalProvince;
	}


	/**
	 * @param hospitalProvince the hospitalProvince to set
	 */
	public void setHospitalProvince(String hospitalProvince) {
		this.hospitalProvince = hospitalProvince;
	}


	@Override
	public String toString() {
		return "Hospitals [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", hospitalRegNo="
				+ hospitalRegNo + ", hospitalPhoneNo=" + hospitalPhoneNo + ", hospitalEmail=" + hospitalEmail
				+ ", hospitalAddress1=" + hospitalAddress1 + ", hospitalAddress2=" + hospitalAddress2
				+ ", hospitalAddress3=" + hospitalAddress3 + ", hospitalSurburb=" + hospitalSurburb + ", hospitalCity="
				+ hospitalCity + ", hospitalProvince=" + hospitalProvince + ", getHospitalId()=" + getHospitalId()
				+ ", getHospitalName()=" + getHospitalName() + ", getHospitalRegNo()=" + getHospitalRegNo()
				+ ", getHospitalPhoneNo()=" + getHospitalPhoneNo() + ", getHospitalEmail()=" + getHospitalEmail()
				+ ", getHospitalAddress1()=" + getHospitalAddress1() + ", getHospitalAddress2()="
				+ getHospitalAddress2() + ", getHospitalAddress3()=" + getHospitalAddress3() + ", getHospitalSurburb()="
				+ getHospitalSurburb() + ", getHospitalCity()=" + getHospitalCity() + ", getHospitalProvince()="
				+ getHospitalProvince() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
