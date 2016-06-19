/**
 * 
 */
package za.co.sindi.paygate.http.impl;

import java.net.URI;

import za.co.sindi.paygate.http.AbstractHttpEntityRequest;

/**
 * @author Bienfait Sindi
 * @since 19 January 2015
 *
 */
public class HttpPostRequest extends AbstractHttpEntityRequest {

	public static final String HTT_METHOD = "POST";
	
	/**
	 * @param uri
	 */
	public HttpPostRequest(String uri) {
		this(URI.create(uri));
	}
	
	/**
	 * @param uri
	 */
	public HttpPostRequest(URI uri) {
		super(HTT_METHOD, uri);
		// TODO Auto-generated constructor stub
	}
}
