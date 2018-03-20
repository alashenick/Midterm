package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester implements java.io.Serializable{

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	public Semester(Date startDate, Date endDate, UUID semesterID) {
		//this.SemesterID = UUID.randomUUID();
		this.SemesterID = semesterID;
		this.StartDate = startDate;
		this.EndDate = endDate;
	}


	public UUID getSemesterID() {
		return this.SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}


	public Date getStartDate() {
		return this.StartDate;
	}
	public void setStartDate(Date startDate) {
		this.StartDate = startDate;
	}


	public Date getEndDate() {
		return this.EndDate;
	}
	public void setEndDate(Date endDate) {
		this.EndDate = endDate;
	}
	
	
}
