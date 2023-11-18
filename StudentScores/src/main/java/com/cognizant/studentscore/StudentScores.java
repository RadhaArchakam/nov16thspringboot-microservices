package com.cognizant.studentscore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.studentscore.entity.Student;
import com.cognizant.studentscore.service.StudentScoreService;

@SpringBootApplication
public class StudentScores {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac= SpringApplication.run(StudentScores.class, args);
	     StudentScoreService bean1=ac.getBean(StudentScoreService.class);
	     
	     bean1.addStudent(501,"Rani",50.00);
	     bean1.addStudent(530,"Madhu", 30.00);
	     bean1.addStudent(560,"Archana", 80.00);
	     bean1.getAllStudent();
	     bean1.updateStudentScore(501, 60.00);
	     bean1.fetchStudentById(530);
	     bean1.removeStudentById(530);
	     bean1.getAllStudent();
	}

}
