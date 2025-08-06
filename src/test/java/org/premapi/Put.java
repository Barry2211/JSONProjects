package org.premapi;

import org.baseURIs.URIs;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI=URIs.reqres.getUri();
		Response put = RestAssured.given()
				.header(URIs.reqAuth.getHead())
				.pathParam("id", 2)
				.when().patch(URIs.singleUser.getUri()+"{id}");
		System.out.println(put.getStatusCode());
		System.out.println(put.asPrettyString());
	}
}
