/**
 * 
 */
package za.co.sindi.paygate;

import java.io.InputStream;
import java.io.Reader;

/**
 * @author Bienfait Sindi
 * @since 22 January 2015
 *
 */
public interface Deserializer {

	public <T> T deserialize(InputStream input) throws DeserializationException;
//	public <T> T deserialize(InputStream input, String charsetName) throws DeserializationException;
//	public <T> T deserialize(InputStream input, Charset charset) throws DeserializationException;
	public <T> T deserialize(Reader reader) throws DeserializationException;
	
}
