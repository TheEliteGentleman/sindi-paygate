/**
 * 
 */
package za.co.sindi.paygate;

/**
 * @author Bienfait Sindi
 * @since 18 January 2015
 *
 */
public interface Message {

	public String getContentType();
	public String getCharsetName();
	public int getContentLength();
	public String getContent();
}
