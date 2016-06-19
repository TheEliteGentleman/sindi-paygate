/**
 * 
 */
package za.co.sindi.paygate.type;

/**
 * @author Bienfait Sindi
 * @since 15 January 2015
 *
 */
public enum Boolean {
	
	Y("Y"),
	N("N")
	;
	private final String value;

	/**
	 * @param value
	 */
	private Boolean(final String value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
}
