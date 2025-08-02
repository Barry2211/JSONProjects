package org.baseURIs;

public enum URIs {
	jsonplace("https://jsonplaceholder.typicode.com/"),
	reqres("https://reqres.in/"),
	singleUser("/api/users/2"),
	userPage("/api/users?page=2");
	
	private final String uri;
	private URIs(String uri) {
		this.uri=uri;
	}
	
	public String getUri() {
		return uri;
	}
}
