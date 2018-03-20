package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() {

		
		//add 3 courses
		Course math241 = new Course("math241", 3, UUID.randomUUID());
		courses.add(math241);
		Course chem103 = new Course("engl110", 3, UUID.randomUUID());
		courses.add(chem103);
		Course phys207 = new Course("phys207", 3, UUID.randomUUID());
		courses.add(phys207);

		//set start and end dates of semesters
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 8, 25);
		Date fall2017start = calendar.getTime();
		calendar.set(2017, 12, 20);
		Date fall2017end = calendar.getTime();
		calendar.set(2018, 2, 5);
		Date spring2018start = calendar.getTime();
		calendar.set(2017, 12, 20);
		Date spring2018end = calendar.getTime();
		
		
		//add semesters
		Semester fall2017 = new Semester(fall2017start, fall2017end, UUID.randomUUID());
		semesters.add(fall2017);
		Semester spring2018 = new Semester(spring2018start, spring2018end, UUID.randomUUID());
		semesters.add(spring2018);

		//add sections of each class each semester
		Section mathFall2017 = new Section(math241.getCourseID(), fall2017.getSemesterID(), UUID.randomUUID(), 101);
		sections.add(mathFall2017);
		Section mathSpring2018 = new Section(math241.getCourseID(), spring2018.getSemesterID(), UUID.randomUUID(), 102);
		sections.add(mathSpring2018);

		Section chemFall2017 = new Section(chem103.getCourseID(), fall2017.getSemesterID(), UUID.randomUUID(), 103);
		sections.add(mathFall2017);
		Section chemSpring2018 = new Section(chem103.getCourseID(), spring2018.getSemesterID(), UUID.randomUUID(), 104);
		sections.add(mathSpring2018);

		Section physFall2017 = new Section(phys207.getCourseID(), fall2017.getSemesterID(), UUID.randomUUID(), 105);
		sections.add(mathFall2017);
		Section physSpring2018 = new Section(phys207.getCourseID(), spring2018.getSemesterID(), UUID.randomUUID(), 106);
		sections.add(mathSpring2018);

		//add 10 students
		Student student1 = new Student("Amanda", "Student", "One", new Date(1998, 3, 27), eMajor.CHEM, "1 Main St",
				"(111)-111-1111", "student1@gmail.com");
		students.add(student1);
		Student student2 = new Student("Anyi", "Student", "Two", new Date(1998, 9, 1), eMajor.COMPSI, "2 Main St",
				"(111)-111-1112", "student2@gmail.com");
		students.add(student2);
		Student student3 = new Student("Rachel", "Student", "Three", new Date(1998, 5, 20), eMajor.BUSINESS,
				"3 Main St", "(111)-111-1113", "student3@gmail.com");
		students.add(student3);
		Student student4 = new Student("Joyce", "Student", "Four", new Date(1998, 7, 23), eMajor.NURSING, "4 Main St",
				"(111)-111-1114", "student4@gmail.com");
		students.add(student4);
		Student student5 = new Student("Nikita", "Student", "Five", new Date(1998, 7, 8), eMajor.COMPSI, "5 Main St",
				"(111)-111-1115", "student5@gmail.com");
		students.add(student5);
		Student student6 = new Student("Cindy", "Student", "Six", new Date(1998, 4, 19), eMajor.CHEM, "6 Main St",
				"(111)-111-1116", "student6@gmail.com");
		students.add(student6);
		Student student7 = new Student("Jessalyn", "Student", "Seven", new Date(1998, 12, 1), eMajor.COMPSI,
				"7 Main St", "(111)-111-1117", "student7@gmail.com");
		students.add(student7);
		Student student8 = new Student("Nate", "Student", "Eight", new Date(1998, 9, 8), eMajor.PHYSICS, "8 Main St",
				"(111)-111-1118", "student8@gmail.com");
		students.add(student8);
		Student student9 = new Student("Ash", "Student", "Nine", new Date(1998, 11, 16), eMajor.NURSING, "9 Main St",
				"(111)-111-1119", "student9@gmail.com");
		students.add(student9);
		Student student10 = new Student("Nisha", "Student", "Ten", new Date(1998, 2, 6), eMajor.BUSINESS, "10 Main St",
				"(111)-111-1110", "student10@gmail.com");
		students.add(student10);

	}

	@Test
	public void test() {

		for (Student student : students) {
			for (Section section : sections) {
				Enrollment enrollments = new Enrollment(student.getStudentID(), section.getSectionID());
				enrollment.add(enrollments);

			}
		}

		// Student 1
		enrollment.get(0).setGrade(4.0);
		enrollment.get(1).setGrade(4.0);
		enrollment.get(2).setGrade(4.0);
		enrollment.get(3).setGrade(4.0);
		enrollment.get(4).setGrade(4.0);
		enrollment.get(5).setGrade(4.0);

		// Student 2
		enrollment.get(6).setGrade(3.0);
		enrollment.get(7).setGrade(3.0);
		enrollment.get(8).setGrade(3.0);
		enrollment.get(9).setGrade(3.0);
		enrollment.get(10).setGrade(3.0);
		enrollment.get(11).setGrade(3.0);

		// Student 3
		enrollment.get(12).setGrade(2.0);
		enrollment.get(13).setGrade(2.0);
		enrollment.get(14).setGrade(2.0);
		enrollment.get(15).setGrade(2.0);
		enrollment.get(16).setGrade(2.0);
		enrollment.get(17).setGrade(2.0);

		// Student 4
		enrollment.get(18).setGrade(3.0);
		enrollment.get(19).setGrade(2.0);
		enrollment.get(20).setGrade(3.0);
		enrollment.get(21).setGrade(2.0);
		enrollment.get(22).setGrade(3.0);
		enrollment.get(23).setGrade(2.0);

		// Student 5
		enrollment.get(24).setGrade(3.0);
		enrollment.get(25).setGrade(4.0);
		enrollment.get(26).setGrade(3.0);
		enrollment.get(27).setGrade(4.0);
		enrollment.get(28).setGrade(3.0);
		enrollment.get(29).setGrade(4.0);

		// Student 6
		enrollment.get(30).setGrade(3.0);
		enrollment.get(31).setGrade(4.0);
		enrollment.get(32).setGrade(2.0);
		enrollment.get(33).setGrade(3.0);
		enrollment.get(34).setGrade(4.0);
		enrollment.get(35).setGrade(2.0);

		// Student 7
		enrollment.get(36).setGrade(3.0);
		enrollment.get(37).setGrade(3.0);
		enrollment.get(38).setGrade(1.0);
		enrollment.get(39).setGrade(3.0);
		enrollment.get(40).setGrade(3.0);
		enrollment.get(41).setGrade(4.0);

		// Student 8
		enrollment.get(42).setGrade(3.0);
		enrollment.get(43).setGrade(1.0);
		enrollment.get(44).setGrade(1.0);
		enrollment.get(45).setGrade(2.0);
		enrollment.get(46).setGrade(4.0);
		enrollment.get(47).setGrade(3.0);

		// Student 9
		enrollment.get(48).setGrade(3.0);
		enrollment.get(49).setGrade(3.0);
		enrollment.get(50).setGrade(4.0);
		enrollment.get(51).setGrade(4.0);
		enrollment.get(52).setGrade(1.0);
		enrollment.get(53).setGrade(1.0);

		// Student 10
		enrollment.get(54).setGrade(2.0);
		enrollment.get(55).setGrade(2.0);
		enrollment.get(56).setGrade(2.0);
		enrollment.get(57).setGrade(2.0);
		enrollment.get(58).setGrade(1.0);
		enrollment.get(59).setGrade(3.0);

		int stud1sum = 0;
		int stud2sum = 0;
		int stud3sum = 0;
		int stud4sum = 0;
		int stud5sum = 0;
		int stud6sum = 0;
		int stud7sum = 0;
		int stud8sum = 0;
		int stud9sum = 0;
		int stud10sum = 0;

		//Student GPAs
			for (int i = 0; i < 6; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(0).getStudentID())) {
					stud1sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 6; i < 12; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(1).getStudentID())) {
					stud2sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 12; i < 18; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(2).getStudentID())) {
					stud3sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 18; i < 24; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(3).getStudentID())) {
					stud4sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 24; i < 30; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(4).getStudentID())) {
					stud5sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 30; i < 36; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(5).getStudentID())) {
					stud6sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 36; i < 42; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(6).getStudentID())) {
					stud7sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 42; i < 48; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(7).getStudentID())) {
					stud8sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 48; i < 54; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(8).getStudentID())) {
					stud9sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 54; i < 60; i++) {
				if (enrollment.get(i).getStudentID().equals(students.get(9).getStudentID())) {
					stud10sum += enrollment.get(i).getGrade();
				}
			}
			
			int section1sum = 0;
			int section2sum = 0;
			int section3sum = 0;
			int section4sum = 0;
			int section5sum = 0;
			int section6sum = 0;
	
			
		//Calculate course average grade
			for (int i = 0; i < 60; i+=6) {
				if (enrollment.get(i).getSectionID().equals(sections.get(0).getSectionID())) {
					section1sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 1; i < 60; i+=6) {
				if (enrollment.get(i).getSectionID().equals(sections.get(1).getSectionID())) {
					section2sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 2; i < 60; i+=6) {
				if (enrollment.get(i).getSectionID().equals(sections.get(2).getSectionID())) {
					section3sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 3; i < 60; i+=6) {
				if (enrollment.get(i).getSectionID().equals(sections.get(3).getSectionID())) {
					section4sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 4; i < 60; i+=6) {
				if (enrollment.get(i).getSectionID().equals(sections.get(4).getSectionID())) {
					section5sum += enrollment.get(i).getGrade();
				}
			}
			for (int i = 5; i < 60; i+=6) {
				if (enrollment.get(i).getSectionID().equals(sections.get(5).getSectionID())) {
					section6sum += enrollment.get(i).getGrade();
				}
			}

		//assert equals for student GPAs
		assertEquals(stud1sum / 6.0, 4.0, 0);
		assertEquals(stud2sum / 6.0, 3.0, 0);
		assertEquals(stud3sum / 6.0, 2.0, 0);
		assertEquals(stud4sum / 6.0, 2.5, 0);
		assertEquals(stud5sum / 6.0, 3.5, 0);
		assertEquals(stud6sum / 6.0, 3.0, 0);
		assertEquals(stud7sum / 6.0, 17.0/6.0, 0);
		assertEquals(stud8sum / 6.0, 14.0/6.0, 0);
		assertEquals(stud9sum / 6.0, 16.0/6.0, 0);
		assertEquals(stud10sum / 6.0, 2.0, 0);

		//assert equals for section average grades
		assertEquals(section1sum / 10.0, 29.0/10.0,0);
		assertEquals(section2sum / 10.0, 28.0/10.0,0);
		assertEquals(section3sum / 10.0, 25.0/10.0,0);
		assertEquals(section4sum / 10.0, 29.0/10.0,0);
		assertEquals(section5sum / 10.0, 28.0/10.0,0);
		assertEquals(section6sum / 10.0, 28.0/10.0,0);
	}

}