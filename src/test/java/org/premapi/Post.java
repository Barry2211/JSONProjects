package org.premapi;

import java.util.HashMap;
import java.util.Map;

import org.baseURIs.URIs;
import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		for(String arg:args) {
			System.out.println(arg);
		}
		RestAssured.baseURI="https://reqres.in/";
		Map<String,String> payload = new HashMap<>();
		payload.put("name", "morpheus");
		payload.put("job","leader");
		
		Response post = RestAssured.given().header(URIs.reqAuth.getHead())
				.contentType(ContentType.JSON).body(payload)
		.when().post("api/users");
		System.out.println(post.asPrettyString());
		Assert.assertEquals(post.getStatusCode(), 201);
	}
}
