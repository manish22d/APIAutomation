package com.Student.Core;

import com.jayway.restassured.response.Response;

public class BaseStep {
	
	public Response response;

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

}
