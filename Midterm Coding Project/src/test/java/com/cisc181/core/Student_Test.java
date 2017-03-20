package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.exceptions.PersonException;

public class Student_Test {
	private static ArrayList<Course> Courses = new ArrayList<Course>();
	private static ArrayList<Semester> Semesters = new ArrayList<Semester>();
	private static ArrayList<Student> Students = new ArrayList<Student>();
	private static ArrayList<Section> Sections = new ArrayList<Section>();
	@BeforeClass
	public static void setup() {

		Course Math = new Course();
		Course English = new Course();
		Course CISC = new Course();
		Courses.add(Math); Courses.add(English); Courses.add(CISC);


		Semester Fall = new Semester();
		Semester Spring  = new Semester();
		Semesters.add(Fall); Semesters.add(Spring);

		Section MathF = new Section();
		Section MathS = new Section();
		Section EnglishF = new Section();
		Section EnglishS = new Section();
		Section CISCF = new Section();
		Section CISCS = new Section();
		Sections.add(MathF);Sections.add(MathS);
		Sections.add(EnglishF);Sections.add(EnglishS);
		Sections.add(CISCF);Sections.add(CISCS);



		try{
			Student S1 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S2 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S3 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S4 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S5 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S6 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S7 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S8 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S9 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");
			Student S10 =  new Student("Bill", "Michael","Doe",new Date(), eMajor.NURSING,
					"1 South St.", "(876)-876-8766", "bill@udel.edu");

			Students.add(S1); Students.add(S2); Students.add(S3); Students.add(S4); Students.add(S5); 
			Students.add(S6); Students.add(S7); Students.add(S8); Students.add(S9); Students.add(S10);  

		} catch(PersonException ex){
			//do nothing. this will not occur.
		}

	}
	@Test
	public void testStudent1() {
		boolean pass = false;

		Student S1 = Students.get(0); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(90);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(80);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(70);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(96);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(91);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-84.5)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	@Test
	public void testStudent2() {
		boolean pass = false;

		Student S1 = Students.get(1); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(90);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(70);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(90);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(96);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(91);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-86.166)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent3() {
		boolean pass = false;

		Student S1 = Students.get(2); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(54);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(80);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(100);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(98);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(91);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-83.83)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent4() {
		boolean pass = false;

		Student S1 = Students.get(3); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(90);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(70);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(70);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(56);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(91);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-76.16)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent5() {
		boolean pass = false;

		Student S1 = Students.get(4); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(70);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(80);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(70);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(90);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(90);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(91);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-81.83)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent6() {
		boolean pass = false;

		Student S1 = Students.get(5); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(90);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(80);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(70);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(96);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(91);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-84.5)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent7() {
		boolean pass = false;

		Student S1 = Students.get(6); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(90);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(60);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(70);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(16);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(88);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-67.33)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent8() {
		boolean pass = false;

		Student S1 = Students.get(7); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(94);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(80);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(65);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(87);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(91);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-82.83)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent9() {
		boolean pass = false;

		Student S1 = Students.get(8); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(87);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(80);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(79);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(94);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(54);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-79.00)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testStudent10() {
		boolean pass = false;

		Student S1 = Students.get(9); 

		Enrollment e1 = new Enrollment(S1.getStudentID(), Sections.get(0).getSectionID()); e1.setGrade(45);
		Enrollment e2 = new Enrollment(S1.getStudentID(), Sections.get(1).getSectionID()); e2.setGrade(86);
		Enrollment e3 = new Enrollment(S1.getStudentID(), Sections.get(2).getSectionID()); e3.setGrade(87);
		Enrollment e4 = new Enrollment(S1.getStudentID(), Sections.get(3).getSectionID()); e4.setGrade(80);
		Enrollment e5 = new Enrollment(S1.getStudentID(), Sections.get(4).getSectionID()); e5.setGrade(92);
		Enrollment e6 = new Enrollment(S1.getStudentID(), Sections.get(5).getSectionID()); e6.setGrade(76);

		double calcGPA = (e1.getGrade()+e2.getGrade()+e3.getGrade()+e4.getGrade()+e5.getGrade()+e6.getGrade())/6;
		if(Math.abs(calcGPA-77.66)<.1)
			pass = true;

		assertEquals(true, pass);
	}
	
	@Test
	public void testChangeMajor(){
		boolean pass = false;
		
		Student Change = Students.get(0);
		
		Change.setMajor(eMajor.PHYSICS);
		
		if(Change.getMajor().equals(eMajor.PHYSICS)){
			pass = true;
		}
		
		assertEquals(true, pass);
	}
	
	
	
	
	
}
