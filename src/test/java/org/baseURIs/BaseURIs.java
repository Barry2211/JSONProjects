package org.baseURIs;

import io.restassured.RestAssured;

public class BaseURIs {

	@SuppressWarnings("static-access")
	public BaseURIs(RestAssured rest,URIs uri) {
		switch(uri) {
		case jsonplace:
			rest.baseURI=URIs.jsonplace.getUri();
			break;
		case reqres:
			rest.baseURI=URIs.reqres.getUri();
			break;
		default:
			break;
		}
	}
}
