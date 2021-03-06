package com.Student.HttpOperations;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;

import com.Student.model.Student;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class StudentPostTest {

	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";

	}

	public void createStudent() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("python");

		Student student = new Student();
		student.setFirstName("Manish");
		student.setLastName("Kumar");
		student.setEmail("Manish22d@yahoo.com");
		student.setProgram("CS");
		student.setCourse(courses);

		given().accept(ContentType.JSON).when().body(student).post().then().statusCode(201);

	}

}
