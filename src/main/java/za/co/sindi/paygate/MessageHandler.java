/**
 * 
 */
package za.co.sindi.paygate;

import java.io.Writer;

/**
 * @author Bienfait Sindi
 * @since 22 January 2015
 *
 */
public interface MessageHandler {

	public Writer getWriter();
	public Message createMessage();
	public void setContentType(String contentType);
	public void setCharsetName(String charsetName);
}
