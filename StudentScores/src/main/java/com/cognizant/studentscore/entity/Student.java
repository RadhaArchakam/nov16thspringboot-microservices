package com.cognizant.studentscore.entity;

public class Student {
	
	private int id;
	private String name;
	private double  score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double newScore) {
		this.score = newScore;
	}
	/*public Student(int id, String name, float score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}*/
	public Student(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	

}
