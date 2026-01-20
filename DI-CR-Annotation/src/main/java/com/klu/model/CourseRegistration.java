package com.klu.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component
public class CourseRegistration {
	private int rollNO;
	private int semester;
	private String studentName;
	private String courseName;
	public  CourseRegistration(@Value("101")int rollNO,@Value("Indrani")String studentName) {
		this.rollNO=rollNO;
		this.studentName=studentName;
}
	@Value("FSAD")
	public void setCourseName(String courseName) {
	this.courseName=courseName;
	}
	@Value("4")
	public void setSemester(int semester) {
		this.semester=semester;
	}
	public void display() {
		System.out.println("RollNO:"+rollNO);
		System.out.println("Name:"+studentName);
		System.out.println("Course:"+courseName);
		System.out.println("Semester:"+semester);
		
	}
}