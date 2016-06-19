/**
 * 
 */
package za.co.sindi.paygate.http.impl;

import java.net.URI;

import za.co.sindi.paygate.http.AbstractHttpRequest;

/**
 * @author Buhake Sindi
 * @since 08 December 2014
 *
 */
public class HttpGetRequest extends AbstractHttpRequest {

	public static final String HTTP_METHOD = "GET";
	
	/**
	 * @param uri
	 */
	public HttpGetRequest(String uri) {
		this(URI.create(uri));
	}
	
	/**
	 * @param uri
	 */
	public HttpGetRequest(URI uri) {
		super(HTTP_METHOD, uri);
	}
}
