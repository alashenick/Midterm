package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section{
	private int RoomID;
	private UUID SemesterID;
	private UUID SectionID;
	private UUID CourseID;

	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		this.CourseID = courseID;
		this.SemesterID = semesterID;
		this.SectionID = sectionID;
		this.RoomID = roomID;
	}

	public int getRoomID() {
		return this.RoomID;
	}

	public void setRoomID(int roomID) {
		this.RoomID = roomID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	
	

}
