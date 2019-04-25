package com.Student.model;

import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private String Program;
	private List<String> Course;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgram() {
		return Program;
	}
	public void setProgram(String program) {
		Program = program;
	}
	public List<String> getCourse() {
		return Course;
	}
	public void setCourse(List<String> course) {
		Course = course;
	}
	
}
