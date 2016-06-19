/**
 * 
 */
package za.co.sindi.paygate.http;


/**
 * @author Bienfait Sindi
 * @since 19 January 2015
 *
 */
public abstract class AbstractHttpEntity implements HttpEntity {

//	private String contentEncoding;
	private String contentType;
	private int contentLength;

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.http.HttpEntity#getContentType()
	 */
	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return contentType;
	}

//	/* (non-Javadoc)
//	 * @see za.co.sindi.paygate.http.HttpEntity#getContentEncoding()
//	 */
//	@Override
//	public String getContentEncoding() {
//		// TODO Auto-generated method stub
//		return contentEncoding;
//	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.http.HttpEntity#getContentLength()
	 */
	@Override
	public int getContentLength() {
		// TODO Auto-generated method stub
		return contentLength;
	}

//	/**
//	 * @param contentEncoding the contentEncoding to set
//	 */
//	protected void setContentEncoding(String contentEncoding) {
//		this.contentEncoding = contentEncoding;
//	}

	/**
	 * @param contentType the contentType to set
	 */
	protected void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @param contentLength the contentLength to set
	 */
	protected void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}
}
