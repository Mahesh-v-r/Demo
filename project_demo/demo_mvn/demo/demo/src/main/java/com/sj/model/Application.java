package com.sj.model;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Application {
	@Id
	private int ApplicationId;
	
	//private String ApplicationStatus;
	private String status;
	public int getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(int applicationId) {
		ApplicationId = applicationId;
	}
	public String getApplicationStatus() {
		//return ApplicationStatus;
		return status;
	}
	public void setApplicationStatus(String status) {
		//ApplicationStatus = applicationStatus;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Application [ApplicationId=" + ApplicationId + ", ApplicationStatus=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ApplicationId, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		return ApplicationId == other.ApplicationId && Objects.equals(status, other.status);
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application(int applicationId, String applicationStatus) {
		super();
		ApplicationId = applicationId;
		status = applicationStatus;
	}
	
	/*@OneToOne
	Course course;
	@OneToOne
	Payment payment;*/
	/*@OneToOne
	Student student;*/

		
	
}
