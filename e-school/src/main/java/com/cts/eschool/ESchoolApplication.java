package com.cts.eschool;

import com.cts.eschool.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ESchoolApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ss = SpringApplication.run(ESchoolApplication.class, args);
		StudentService s = ss.getBean(StudentService.class);
		s.addNewStudentDetail(1, "Tarun", 78);
		s.addNewStudentDetail(2, "Ganesh", 45);
		s.addNewStudentDetail(3, "Abhi", 98);

		s.getAllStudentDetails();
		s.getStudentDetailsById(2);
		s.updateStudentScore(2,50.8);
		s.deleteStudentDetails(1);
		s.getAllStudentDetails();
	}

}
