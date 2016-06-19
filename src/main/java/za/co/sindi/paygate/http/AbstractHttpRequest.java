/**
 * 
 */
package za.co.sindi.paygate.http;

import java.net.URI;

import za.co.sindi.common.utils.PreConditions;

/**
 * @author Buhake Sindi
 * @since 08 December 2014
 *
 */
public abstract class AbstractHttpRequest extends AbstractHeaderParams implements HttpRequest {

	private String method;
	private URI uri;
	
	/**
	 * @param method
	 * @param uri
	 */
	protected AbstractHttpRequest(String method, URI uri) {
		super();
		PreConditions.checkArgument(method != null && !method.isEmpty(), "No HTTP Method provided.");
		PreConditions.checkArgument(uri != null, "No HTTP URI provided.");
		
		this.method = method;
		this.uri = uri;
	}
	
	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.http.HttpRequest#getMethod()
	 */
	public String getMethod() {
		// TODO Auto-generated method stub
		return method;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.http.HttpRequest#getURI()
	 */
	public URI getURI() {
		// TODO Auto-generated method stub
		return uri;
	}
}
