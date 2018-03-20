package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course implements java.io.Serializable {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	
	public Course(String courseName, int gradePoints, UUID courseID) {
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.GradePoints = gradePoints;
	}
	
	
	public UUID getCourseID() {
		return this.CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	
	
	public String getCourseName() {
		return this.CourseName;
	}
	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}
	
	
	public int getGradePoints() {
		return this.GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.GradePoints = gradePoints;
	}
	
	

}
