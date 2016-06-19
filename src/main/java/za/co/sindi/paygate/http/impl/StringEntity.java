/**
 * 
 */
package za.co.sindi.paygate.http.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import za.co.sindi.common.utils.PreConditions;
import za.co.sindi.common.utils.Strings;
import za.co.sindi.paygate.http.AbstractHttpEntity;
import za.co.sindi.paygate.http.HttpUtils;

/**
 * @author Bienfait Sindi
 * @since 19 JAnuary 2015
 *
 */
public class StringEntity extends AbstractHttpEntity {

	private byte[] content;
	
	/**
	 * 
	 * @param source
	 */
	public StringEntity(String source) {
		this(source, "text/plain");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param source
	 * @param contentType
	 */
	public StringEntity(String source, String contentType) {
		this(source, contentType, HttpUtils.DEFAULT_CHARSET_NAME);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param source
	 * @param contentType
	 * @param charsetName
	 */
	public StringEntity(String source, String contentType, String charsetName) {
		this(source, contentType, Charset.forName(charsetName));
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param source
	 * @param contentType
	 * @param charset
	 */
	public StringEntity(String source, String contentType, Charset charset) {
		super();
		// TODO Auto-generated constructor stub
		PreConditions.checkArgument(!Strings.isNullOrEmpty(source), "No string source provided.");
		this.content = source.getBytes(charset);
		setContentType(contentType);
		setContentLength(this.content.length);
//		setContentEncoding(charset.name());
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.http.HttpEntity#getContent()
	 */
	@Override
	public InputStream getContent() {
		// TODO Auto-generated method stub
		return new ByteArrayInputStream(content);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.http.HttpEntity#writeTo(java.io.OutputStream)
	 */
	@Override
	public void writeTo(OutputStream output) throws IOException {
		// TODO Auto-generated method stub
		output.write(content);
		output.flush();
	}
}
