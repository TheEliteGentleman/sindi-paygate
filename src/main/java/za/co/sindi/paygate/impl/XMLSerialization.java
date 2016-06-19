/**
 * 
 */
package za.co.sindi.paygate.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import za.co.sindi.common.utils.PreConditions;
import za.co.sindi.paygate.Constants;
import za.co.sindi.paygate.DeserializationException;
import za.co.sindi.paygate.Deserializer;
import za.co.sindi.paygate.MessageHandler;
import za.co.sindi.paygate.SerializationException;
import za.co.sindi.paygate.Serializer;
import za.co.sindi.paygate.http.HttpUtils;
import za.co.sindi.paygate.jaxb.JAXBSingleton;

/**
 * @author Bienfait Sindi
 * @since 22 January 2015
 *
 */
public class XMLSerialization implements Serializer, Deserializer {
	
//	private static final Logger LOGGER = Logger.getLogger(XMLSerialization.class.getName());

	private static final String XML_DECLARATION = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	private static final String PAYGATE_DTD_DEF = "<!DOCTYPE protocol SYSTEM \"" + Constants.PAYXML_PROTOCOL_SYSTEM_DOCTYPE + "\">";
	private static final String JAXB_XML_HEADERS = "com.sun.xml.internal.bind.xmlHeaders";
	
	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Deserializer#deserialize(java.io.InputStream)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T deserialize(InputStream input) throws DeserializationException {
		// TODO Auto-generated method stub
		try {
			return (T) JAXBSingleton.getInstance().getUnmarshaller().unmarshal(input);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			throw new DeserializationException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Deserializer#deserialize(java.io.Reader)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T deserialize(Reader reader) throws DeserializationException {
		// TODO Auto-generated method stub
		try {
			return (T) JAXBSingleton.getInstance().getUnmarshaller().unmarshal(reader);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			throw new DeserializationException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Serializer#serialize(java.lang.Object, java.io.OutputStream)
	 */
	@Override
	public void serialize(Object object, OutputStream output) throws SerializationException {
		// TODO Auto-generated method stub
		try {
			Marshaller marshaller = JAXBSingleton.getInstance().getMarshaller();
			marshaller.setProperty(JAXB_XML_HEADERS, XML_DECLARATION + PAYGATE_DTD_DEF);
		    marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		    marshaller.marshal(object, output);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			throw new SerializationException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Serializer#serialize(java.lang.Object, java.io.Writer)
	 */
	@Override
	public void serialize(Object object, Writer writer)	throws SerializationException {
		// TODO Auto-generated method stub
		PreConditions.checkArgument(writer != null, "No writer provided.");
		try {
			writer.write(XML_DECLARATION);
			writer.write(PAYGATE_DTD_DEF);
			Marshaller marshaller = JAXBSingleton.getInstance().getMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		    marshaller.marshal(object, writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new SerializationException("Unable to write XML declarations.", e);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			throw new SerializationException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.paygate.Serializer#serialize(java.lang.Object, za.co.sindi.paygate.MessageHandler)
	 */
	@Override
	public void serialize(Object object, MessageHandler messageHandler) throws SerializationException {
		// TODO Auto-generated method stub
		PreConditions.checkArgument(messageHandler != null, "No MessageHandler provided.");
		messageHandler.setCharsetName(HttpUtils.CHARSET_NAME_UTF8);
		messageHandler.setContentType("text/xml");
		serialize(object, messageHandler.getWriter());
	}
}
