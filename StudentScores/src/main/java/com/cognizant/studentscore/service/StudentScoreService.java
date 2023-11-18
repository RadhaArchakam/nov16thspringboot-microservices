package com.cognizant.studentscore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.cognizant.studentscore.entity.Student;

@Component
public class StudentScoreService implements InitializingBean ,DisposableBean  {
	
	List<Student> students=new ArrayList<Student>();
	
	public void addStudent(int Id,String name,double score) {
		Student s =new Student (Id,name,score);
	      students.add(s);
	}
	
	public void getAllStudent(){
		
		for(Student s: students){

            System.out.println("\nName :"+s.getName());
            System.out.println("Id: "+s.getId());
            System.out.println("Score: "+s.getScore());
            updateScoreLog(s.getScore());

        }
	}

	private void updateScoreLog(double score) {
		if(score>0 && score<100) {
			if(score<50) {
				System.out.println("Below Average");
			}
			else if (score>50&&score<75) {
				System.out.println("Average");
			}
			else {
			System.out.println("Above Average");
			}
		}
		
	}
	
	public void updateStudentScore(int Id, double NewScore) {
		for(Student s:students) {
			if(s.getId()==NewScore) {
				s.setScore(NewScore);
				System.out.println("Updated Score For Student");
				System.out.println("Name"+s.getName());
				System.out.println("Id"+s.getId());
			}
		}
		
	}
	
	public void fetchStudentById(int Id) {
		for(Student s:students) {
			if(s.getId()==Id) {
				System.out.println("Id"+s.getId());
				System.out.println("Name"+s.getName());
				System.out.println("Score"+s.getScore());
			}
		}
	}
	
	public void removeStudentById(int Id)  {
		for(Student s:students) {
			if(s.getId()==Id) {
				System.out.println("Removed student is "+s.getId());
				students.remove(s);
			}
		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("StudentService is being destroyed");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("StudentService has been initialized");
		
	}
	
	
}
