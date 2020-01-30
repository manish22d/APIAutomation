package com.Student.HttpOperations;

import com.Student.Core.BaseStep;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class Methods extends BaseStep{
	BaseStep baseStep;
	
	public void post(String Request) {
		RequestSpecification request = RestAssured.given();
		
		// Add a header stating the Request body is a JSON
		request.header("Content-Type", "application/json");

		// Add the Json to the body of the request
		request.body(Request);

		// Post the request and check the response
		Response response = request.post("/register");
		
		baseStep.setResponse(response);
	}

}
