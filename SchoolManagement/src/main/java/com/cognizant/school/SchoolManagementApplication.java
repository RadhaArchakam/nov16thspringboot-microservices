package com.cognizant.school;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cognizant.school.entity.ApplicationRunnerImpl;
import com.cognizant.school.entity.Book;
import com.cognizant.school.entity.Classroom;
import com.cognizant.school.entity.Library;
import com.cognizant.school.entity.Student;

@SpringBootApplication
public class SchoolManagementApplication {
	
	@Bean
	public Book bookBean() {
		return new Book("KidsBook","Radha");
	}
	
	
	
	@Bean
	public Library libraryBean() {
		return new Library();
	}
	
	@Bean 
	public Student studentBean() {
		return new Student("Mandhu",45);
}

	@Bean
	public Classroom classroomBean() {
		Student student = null;
		return new Classroom(studentBean());
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ac=SpringApplication.run(SchoolManagementApplication.class, args);
		ApplicationRunnerImpl applicationrunner=ac.getBean(ApplicationRunnerImpl.class);
		ac.close();
		
	}

}
