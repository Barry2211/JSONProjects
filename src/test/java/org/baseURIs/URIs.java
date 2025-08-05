package org.baseURIs;

import io.restassured.http.Header;
public enum URIs {
	jsonplace("https://jsonplaceholder.typicode.com/"),
	reqres("https://reqres.in/"),
	reqAuth(new Header("x-api-key","reqres-free-v1")),
	singleUser("/api/users/2"),
	userPage("/api/users?page=2");
	
	private Header head;
	private String uri;
	
	private URIs(Header head) {
		this.head = head;
	}
	private URIs(String uri) {
		this.uri=uri;
	}
	
	public String getUri() {
		return uri;
	}
	public Header getHead() {
		return head;
	}
}
