package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_Test {
	
	@BeforeClass
	public static void setup() {

	}
	@Test
	public void testAvgSalaries() {
		double SumSal = 0;
		boolean pass = false;
		
		ArrayList<Staff> StaffMembers = new ArrayList<Staff>(); 
		try{
			StaffMembers.add(new Staff("Jared", "Michael", "Glaser", new Date(),"That Road Rd.", "(875)-834-2394", "jmglaser@udel.edu", "Tues 1-3pm", 1, 40.00, new Date(), eTitle.MR));
			StaffMembers.add(new Staff("Jared", "Michael", "Glaser", new Date(),"That Road Rd.", "(875)-834-2394", "jmglaser@udel.edu", "Tues 1-3pm", 1, 30.00, new Date(), eTitle.MR));
			StaffMembers.add(new Staff("Jared", "Michael", "Glaser", new Date(),"That Road Rd.", "(875)-834-2394", "jmglaser@udel.edu", "Tues 1-3pm", 1, 20.00, new Date(), eTitle.MR));
			StaffMembers.add(new Staff("Jared", "Michael", "Glaser", new Date(),"That Road Rd.", "(875)-834-2394", "jmglaser@udel.edu", "Tues 1-3pm", 1, 10.00, new Date(), eTitle.MR));
			} catch(PersonException ex){
				//I know it won't throw this. So I do nothing.
			}
	
		for(Staff s: StaffMembers){
			SumSal += s.getSalary();
		}
		
		if(Math.abs((SumSal/StaffMembers.size())-25.00) < .01){
			pass = true;
		}
		assertEquals(true, pass);
		
	}
	
	@Test
	public void testInvalidPhone() {
		boolean pass = false;
		//Phone number doesn't have ( )"
		try{
		Staff test = new Staff("Jared", "Michael", "Glaser", new Date(),"That Road Rd.", "275-834-2394", "jmglaser@udel.edu", "Tues 1-3pm", 1, 10.00, new Date(), eTitle.MR);
		} catch (PersonException pe){
			pass = true;
		}
		assertEquals(true, pass);
	}
	
	@Test
	public void testInvalidDate() {
		boolean pass = false;
		//Phone number doesn't have ( )"
		try{
		Date d = new Date((long)-3e+45);
		Staff test = new Staff("Jared", "Michael", "Glaser", d,"That Road Rd.", "(275)-834-2394", "jmglaser@udel.edu", "Tues 1-3pm", 1, 10.00, new Date(), eTitle.MR);
		} catch (PersonException pe){
			pass = true;
		}
		assertEquals(true, pass);
	}
	

}
