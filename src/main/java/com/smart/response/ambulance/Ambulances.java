/**
 * 
 */
package com.smart.response.ambulance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Michael Shaba
 *
 */
@Entity
@Table(name="Ambulances")

public class Ambulances implements Serializable{
	
	@Id
	private String ambulanceId;
	private String ambulanceName;
	private String ambulanceRegNo;
	private String ambulancePhoneNo;
	private String ambulanceEmail;
	private String ambulanceAddress1;
	private String ambulanceAddress2;
	private String ambulanceAddress3;
	private String ambulanceSurburb;
	private String ambulanceCity;
	private String ambulanceProvince;
	

	/**
	 * 
	 */
	public Ambulances() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param ambulanceId
	 * @param ambulanceName
	 * @param ambulanceRegNo
	 * @param ambulancePhoneNo
	 * @param ambulanceEmail
	 * @param ambulanceAddress1
	 * @param ambulanceAddress2
	 * @param ambulanceAddress3
	 * @param ambulanceSurburb
	 * @param ambulanceCity
	 * @param ambulanceProvince
	 */
	public Ambulances(String ambulanceId, String ambulanceName, String ambulanceRegNo, String ambulancePhoneNo,
			String ambulanceEmail, String ambulanceAddress1, String ambulanceAddress2, String ambulanceAddress3,
			String ambulanceSurburb, String ambulanceCity, String ambulanceProvince) {
		super();
		this.ambulanceId = ambulanceId;
		this.ambulanceName = ambulanceName;
		this.ambulanceRegNo = ambulanceRegNo;
		this.ambulancePhoneNo = ambulancePhoneNo;
		this.ambulanceEmail = ambulanceEmail;
		this.ambulanceAddress1 = ambulanceAddress1;
		this.ambulanceAddress2 = ambulanceAddress2;
		this.ambulanceAddress3 = ambulanceAddress3;
		this.ambulanceSurburb = ambulanceSurburb;
		this.ambulanceCity = ambulanceCity;
		this.ambulanceProvince = ambulanceProvince;
	}


	/**
	 * @return the ambulanceId
	 */
	public String getambulanceId() {
		return ambulanceId;
	}


	/**
	 * @param ambulanceId the ambulanceId to set
	 */
	public void setambulanceId(String ambulanceId) {
		this.ambulanceId = ambulanceId;
	}


	/**
	 * @return the ambulanceName
	 */
	public String getambulanceName() {
		return ambulanceName;
	}


	/**
	 * @param ambulanceName the ambulanceName to set
	 */
	public void setambulanceName(String ambulanceName) {
		this.ambulanceName = ambulanceName;
	}


	/**
	 * @return the ambulanceRegNo
	 */
	public String getambulanceRegNo() {
		return ambulanceRegNo;
	}


	/**
	 * @param ambulanceRegNo the ambulanceRegNo to set
	 */
	public void setambulanceRegNo(String ambulanceRegNo) {
		this.ambulanceRegNo = ambulanceRegNo;
	}


	/**
	 * @return the ambulancePhoneNo
	 */
	public String getambulancePhoneNo() {
		return ambulancePhoneNo;
	}


	/**
	 * @param ambulancePhoneNo the ambulancePhoneNo to set
	 */
	public void setambulancePhoneNo(String ambulancePhoneNo) {
		this.ambulancePhoneNo = ambulancePhoneNo;
	}


	/**
	 * @return the ambulanceEmail
	 */
	public String getambulanceEmail() {
		return ambulanceEmail;
	}


	/**
	 * @param ambulanceEmail the ambulanceEmail to set
	 */
	public void setambulanceEmail(String ambulanceEmail) {
		this.ambulanceEmail = ambulanceEmail;
	}


	/**
	 * @return the ambulanceAddress1
	 */
	public String getambulanceAddress1() {
		return ambulanceAddress1;
	}


	/**
	 * @param ambulanceAddress1 the ambulanceAddress1 to set
	 */
	public void setambulanceAddress1(String ambulanceAddress1) {
		this.ambulanceAddress1 = ambulanceAddress1;
	}


	/**
	 * @return the ambulanceAddress2
	 */
	public String getambulanceAddress2() {
		return ambulanceAddress2;
	}


	/**
	 * @param ambulanceAddress2 the ambulanceAddress2 to set
	 */
	public void setambulanceAddress2(String ambulanceAddress2) {
		this.ambulanceAddress2 = ambulanceAddress2;
	}


	/**
	 * @return the ambulanceAddress3
	 */
	public String getambulanceAddress3() {
		return ambulanceAddress3;
	}


	/**
	 * @param ambulanceAddress3 the ambulanceAddress3 to set
	 */
	public void setambulanceAddress3(String ambulanceAddress3) {
		this.ambulanceAddress3 = ambulanceAddress3;
	}


	/**
	 * @return the ambulanceSurburb
	 */
	public String getambulanceSurburb() {
		return ambulanceSurburb;
	}


	/**
	 * @param ambulanceSurburb the ambulanceSurburb to set
	 */
	public void setambulanceSurburb(String ambulanceSurburb) {
		this.ambulanceSurburb = ambulanceSurburb;
	}


	/**
	 * @return the ambulanceCity
	 */
	public String getambulanceCity() {
		return ambulanceCity;
	}


	/**
	 * @param ambulanceCity the ambulanceCity to set
	 */
	public void setambulanceCity(String ambulanceCity) {
		this.ambulanceCity = ambulanceCity;
	}


	/**
	 * @return the ambulanceProvince
	 */
	public String getambulanceProvince() {
		return ambulanceProvince;
	}


	/**
	 * @param ambulanceProvince the ambulanceProvince to set
	 */
	public void setambulanceProvince(String ambulanceProvince) {
		this.ambulanceProvince = ambulanceProvince;
	}


	@Override
	public String toString() {
		return "ambulances [ambulanceId=" + ambulanceId + ", ambulanceName=" + ambulanceName + ", ambulanceRegNo="
				+ ambulanceRegNo + ", ambulancePhoneNo=" + ambulancePhoneNo + ", ambulanceEmail=" + ambulanceEmail
				+ ", ambulanceAddress1=" + ambulanceAddress1 + ", ambulanceAddress2=" + ambulanceAddress2
				+ ", ambulanceAddress3=" + ambulanceAddress3 + ", ambulanceSurburb=" + ambulanceSurburb + ", ambulanceCity="
				+ ambulanceCity + ", ambulanceProvince=" + ambulanceProvince + ", getambulanceId()=" + getambulanceId()
				+ ", getambulanceName()=" + getambulanceName() + ", getambulanceRegNo()=" + getambulanceRegNo()
				+ ", getambulancePhoneNo()=" + getambulancePhoneNo() + ", getambulanceEmail()=" + getambulanceEmail()
				+ ", getambulanceAddress1()=" + getambulanceAddress1() + ", getambulanceAddress2()="
				+ getambulanceAddress2() + ", getambulanceAddress3()=" + getambulanceAddress3() + ", getambulanceSurburb()="
				+ getambulanceSurburb() + ", getambulanceCity()=" + getambulanceCity() + ", getambulanceProvince()="
				+ getambulanceProvince() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
