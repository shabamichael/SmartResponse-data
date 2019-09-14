/**
 * 
 */
package com.smart.response.pregnancy;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name="pregnacy")

public class Pregnancy implements Serializable{
	
	@Id

	@SequenceGenerator(
			name="hosp_seq", initialValue = 1000, allocationSize=100 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "hosp_seq")
	@Column(name="hospitalId", updatable=false, nullable=false )
	private long pregnancyId;
	private Date lastPeriod;
	
	
	/**
	 * 
	 */
	public Pregnancy() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param pregnancyId
	 * @param lastPeriod
	 */
	public Pregnancy(long pregnancyId, Date lastPeriod) {
		super();
		this.pregnancyId = pregnancyId;
		this.lastPeriod = lastPeriod;
	}


	/**
	 * @return the pregnancyId
	 */
	public long getPregnancyId() {
		return pregnancyId;
	}


	/**
	 * @param pregnancyId the pregnancyId to set
	 */
	public void setPregnancyId(long pregnancyId) {
		this.pregnancyId = pregnancyId;
	}


	/**
	 * @return the lastPeriod
	 */
	public Date getLastPeriod() {
		return lastPeriod;
	}


	/**
	 * @param lastPeriod the lastPeriod to set
	 */
	public void setLastPeriod(Date lastPeriod) {
		this.lastPeriod = lastPeriod;
	}


	@Override
	public String toString() {
		return "Pregnancy [pregnancyId=" + pregnancyId + ", lastPeriod=" + lastPeriod + "]";
	}

	

}
