/**
 * 
 */
package za.co.sindi.paygate.payxml.type;

/**
 * @author Bienfait Sindi
 * @since 25 January 2015
 *
 */
public enum Entity {
	BUSINESS("entity"),
	INDIVIDUAL("individual")
	;
	private final String value;

	/**
	 * @param value
	 */
	private Entity(final String value) {
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
	
	public static Entity of(final String entity) {
		if (BUSINESS.value.equals(entity)) {
			return BUSINESS;
		}
		
		if (INDIVIDUAL.value.equals(entity)) {
			return INDIVIDUAL;
		}
		
		throw new IllegalArgumentException("No such entity '" + entity + "'.");
	}
}
