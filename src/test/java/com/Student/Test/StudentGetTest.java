package com.Student.Test;

import org.junit.BeforeClass;
import org.junit.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

public class StudentGetTest {
	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/student";
		
	}
	
	@Test
	public void getAllStudentDetails() {
		
		/**
		 * Given()
		 * set cookie, add auth, adding parameter, setting header info
		 * .when()
		 * get, post, put
		 * .then()
		 * Validate status code, Extract header, extract response code
		 */
		
		Response response  = given()
		.when()
		.get("/list");
		
		System.out.println(response.body().prettyPrint());

		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
		
		
	}

}
