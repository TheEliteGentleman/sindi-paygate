/**
 * 
 */
package za.co.sindi.paygate.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Bienfait Sindi
 * @since 19 January 2015
 *
 */
public interface HttpEntity {

	public InputStream getContent();
	public String getContentType();
//	public String getContentEncoding();
	public int getContentLength();
	public void writeTo(OutputStream output) throws IOException;
}
