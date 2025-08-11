package org.premapi.Serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Execution {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(2025,2026));
		DOBData d = new DOBData(20,"Aug",list);
		Root root = new Root("prem","qa",d);
		File location = new File("D:\\Eclipse\\eclipse\\bin\\ApiProjects\\target\\serialize.json");
		ObjectMapper mapper = new ObjectMapper();
		//mapper.writeValue(location, root); -> To create JSON File
		String payload = mapper.writeValueAsString(root);
		System.out.println(payload);
		RestAssured.baseURI="https://reqres.in/";
		Response post = RestAssured.given().header("x-api-key","reqres-free-v1")
				.contentType(ContentType.JSON)
		.body(payload).when().post("api/users");
		System.out.println(post.asPrettyString());
	}

}
