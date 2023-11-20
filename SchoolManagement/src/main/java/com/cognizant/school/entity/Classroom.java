package com.cognizant.school.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Classroom {
	
	private Student student;
	
   
	@Autowired
	public Classroom(Student student) {
		super();
		this.student = student;
	}
	
	public void displayStudentDetails () {
		System.out.println("Printing Details Of Student");
		System.out.println("Name\t"+student.getName());
		System.out.println("Age\t"+student.getAge());
	}
}
