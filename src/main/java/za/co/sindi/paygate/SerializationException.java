/**
 * 
 */
package za.co.sindi.paygate;

/**
 * @author Bienfait Sindi
 * @since 22 January 2015
 *
 */
public class SerializationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8457608206077001098L;

//	/**
//	 * 
//	 */
//	public SerializationException() {
//		// TODO Auto-generated constructor stub
//	}

	/**
	 * @param message
	 */
	public SerializationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public SerializationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SerializationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public SerializationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
}
