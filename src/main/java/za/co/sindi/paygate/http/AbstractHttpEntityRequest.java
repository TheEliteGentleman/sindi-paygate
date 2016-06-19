/**
 * 
 */
package za.co.sindi.paygate.http;

import java.net.URI;

/**
 * @author Bienfait Sindi
 * @since 19 January 2015
 *
 */
public abstract class AbstractHttpEntityRequest extends AbstractHttpRequest {

	private HttpEntity httpEntity;

	/**
	 * @param method
	 * @param uri
	 */
	protected AbstractHttpEntityRequest(String method, URI uri) {
		super(method, uri);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the httpEntity
	 */
	public HttpEntity getHttpEntity() {
		return httpEntity;
	}

	/**
	 * @param httpEntity the httpEntity to set
	 */
	public void setHttpEntity(HttpEntity httpEntity) {
		this.httpEntity = httpEntity;
	}
}
