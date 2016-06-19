/**
 * 
 */
package za.co.sindi.paygate.payxml.type;

/**
 * @author Bienfait Sindi
 * @since 15 January 2015
 *
 */
public enum Boolean {
	
	Y("Y"),
	YES("YES"),
	N("N"),
	NO("NO")
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
	
	public static Boolean of(String value) {
		if (Y.value.equals(value)) {
			return Y;
		}
		
		if (YES.value.equals(value)) {
			return YES;
		}
		
		if (N.value.equals(value)) {
			return N;
		}
		
		if (NO.value.equals(value)) {
			return NO;
		}
		
		throw new IllegalArgumentException("Invalid boolean type '" + value + "'.");
	}
}
