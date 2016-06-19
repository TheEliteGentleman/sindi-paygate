/**
 * 
 */
package za.co.sindi.paygate.impl;

import java.io.StringWriter;
import java.io.Writer;

import za.co.sindi.paygate.AbstractMessageHandler;
import za.co.sindi.paygate.Message;

/**
 * @author Bienfait Sindi
 * @since 22 January 2015
 *
 */
public class StringBasedMessageHandler extends AbstractMessageHandler {

	private StringWriter writer = new StringWriter();
	
	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.MessageHandler#getWriter()
	 */
	@Override
	public Writer getWriter() {
		// TODO Auto-generated method stub
		return writer;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.MessageHandler#createMessage()
	 */
	@Override
	public Message createMessage() {
		// TODO Auto-generated method stub
		return new BasicMessage(writer.toString(), getContentType(), getCharsetName());
	}
}
