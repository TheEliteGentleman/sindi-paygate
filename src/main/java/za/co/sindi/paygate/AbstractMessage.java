/**
 * 
 */
package za.co.sindi.paygate;

/**
 * @author Bienfait Sindi
 * @since 18 January 2015
 *
 */
public abstract class AbstractMessage implements Message {

	private String contentType;
	private String charsetName;
	private int contentLength;
	private String content;
	
	/**
	 * @param content
	 * @param contentType
	 * @param charsetName
	 */
	protected AbstractMessage(String content, String contentType, String charsetName) {
		super();
		this.content = content;
		this.contentType = contentType;
		this.charsetName = charsetName;
		this.contentLength = (content == null) ? 0 : content.length();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Message#getContentType()
	 */
	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return contentType;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Message#getCharsetName()
	 */
	@Override
	public String getCharsetName() {
		// TODO Auto-generated method stub
		return charsetName;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Message#getContentLength()
	 */
	@Override
	public int getContentLength() {
		// TODO Auto-generated method stub
		return contentLength;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Message#getContent()
	 */
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}
}
