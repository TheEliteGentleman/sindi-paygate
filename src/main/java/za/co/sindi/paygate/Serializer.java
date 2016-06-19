/**
 * 
 */
package za.co.sindi.paygate;

import java.io.OutputStream;
import java.io.Writer;

/**
 * @author Bienfait Sindi
 * @since 22 January 2015
 *
 */
public interface Serializer {

	public void serialize(Object object, OutputStream output) throws SerializationException;
	public void serialize(Object object, Writer writer) throws SerializationException;
	public void serialize(Object object, MessageHandler messageHandler) throws SerializationException;
}
