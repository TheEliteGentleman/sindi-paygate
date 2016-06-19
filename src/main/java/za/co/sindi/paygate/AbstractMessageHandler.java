/**
 * 
 */
package za.co.sindi.paygate;


/**
 * @author Bienfait Sindi
 * @since 22 January 2015
 *
 */
public abstract class AbstractMessageHandler implements MessageHandler {

	private String contentType;
	private String charsetName;
	
	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.MessageHandler#setContentType(java.lang.String)
	 */
	@Override
	public void setContentType(String contentType) {
		// TODO Auto-generated method stub
		this.contentType = contentType;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.MessageHandler#setCharsetName(java.lang.String)
	 */
	@Override
	public void setCharsetName(String charsetName) {
		// TODO Auto-generated method stub
		this.charsetName = charsetName;
	}

	/**
	 * @return the contentType
	 */
	protected String getContentType() {
		return contentType;
	}

	/**
	 * @return the charsetName
	 */
	protected String getCharsetName() {
		return charsetName;
	}
}
