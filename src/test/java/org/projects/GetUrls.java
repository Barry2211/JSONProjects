package org.projects;

import org.baseURIs.URIs;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUrls {
	public static void main(String[] args) {
		RestAssured.baseURI=URIs.reqres.getUri();
		String data = given().when().get(URIs.singleUser.getUri()).asPrettyString();
		System.out.println(data);
		
		given().when().get(URIs.userPage.getUri())
		.then().body(
				"data.find{it.id==7}.first_name",
				equalTo("Michael")
				);
	}
}
