package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

import antlr.collections.List;

public class Staff_Test {

	static ArrayList<Staff> staffs = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		
		Staff staff1 = new Staff("Doctor", "Professor", "One", new Date(1960, 1, 5), "1 Main St",
				"(111)-111-1111", "professor1@gmail.com", "Monday", 0, 10000, new Date (2016, 1, 1), eTitle.MRS);
		staffs.add(staff1);
		Staff staff2 = new Staff("Doctor", "Professor", "Two", new Date(1960, 2, 10), "2 Main St",
				"(111)-111-1112", "professor2@gmail.com", "Monday", 0, 20000, new Date (2016, 1, 1), eTitle.MS);
		staffs.add(staff2);
		Staff staff3 = new Staff("Doctor", "Professor", "Three", new Date(1960, 3, 12), "3 Main St",
				"(111)-111-1113", "professor3@gmail.com", "Monday", 0, 30000, new Date (2016, 1, 1), eTitle.MR);
		staffs.add(staff3);
		Staff staff4 = new Staff("Doctor", "Professor", "Four", new Date(1960, 4, 15), "4 Main St",
				"(111)-111-1114", "professor4@gmail.com", "Monday", 0, 40000, new Date (2016, 1, 1), eTitle.MS);
		staffs.add(staff4);
		Staff staff5 = new Staff("Doctor", "Professor", "Five", new Date(1960, 5, 21), "5 Main St",
				"(111)-111-1115", "professor4@gmail.com", "Monday", 0, 50000, new Date (2016, 1, 1), eTitle.MS);
		staffs.add(staff5);
}
		
	
	
	@Test //test average salaries
	public void test() {
		double totalSal = 0;
		for(int i = 0; i<5; i++) {
			double sal = staffs.get(i).getSalary();
			totalSal+=sal;
		}
				
		double avgSal = totalSal/5.0;
		assertEquals(avgSal,30000.0,0);
	}	

}
