package org.rest;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

public class SampleAPI {

	@Test
	public void meth() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RestAssured.get("/users/1")
		.then().assertThat()
		.statusCode(200)
		.and()
		.contentType(ContentType.JSON)
		.and()
		.body("id", equalTo(1));

		String output = RestAssured.get("/users").getBody().asPrettyString();
		System.out.println(output);

	}
}
